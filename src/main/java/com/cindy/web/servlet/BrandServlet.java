package com.cindy.web.servlet;

import com.alibaba.fastjson.JSON;
import com.cindy.pojo.Brand;
import com.cindy.pojo.PageBean;
import com.cindy.service.BrandService;
import com.cindy.service.impl.BrandServiceImpl;
import org.apache.ibatis.annotations.Insert;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet{
    private BrandService brandService=new BrandServiceImpl();
    public void selectAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        List<Brand> brands = brandService.selectAll();

        String jsonString = JSON.toJSONString(brands);

        response.getWriter().write(jsonString);
    }

    public void add (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Brand brand=JSON.parseObject(params, Brand.class);

        brandService.add(brand);

        response.getWriter().write("success");
    }

    public void update (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Brand brand=JSON.parseObject(params, Brand.class);

        brandService.update(brand);

        response.getWriter().write("success");
    }

    public void deleteById (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Brand brand=JSON.parseObject(params, Brand.class);

        int id=brand.getId();
        brandService.deleteById(id);
        response.getWriter().write("success");
    }

    public void deleteByIds (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        int[] ids = JSON.parseObject(params, int[].class);

        brandService.deleteByIds(ids);
        response.getWriter().write("success");
    }

    public void selectByPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String _currentPage=request.getParameter("currentPage");
        String _pageSize=request.getParameter("pageSize");

        int currentPage= Integer.parseInt(_currentPage);
        int pageSize=Integer.parseInt(_pageSize);

        PageBean<Brand> pageBean = brandService.selectByPage(currentPage, pageSize);

        String jsonString = JSON.toJSONString(pageBean);

        response.getWriter().write(jsonString);
    }

    public void selectByPageAndCondition(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String _currentPage=request.getParameter("currentPage");
        String _pageSize=request.getParameter("pageSize");

        int currentPage= Integer.parseInt(_currentPage);
        int pageSize=Integer.parseInt(_pageSize);

        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Brand brand = JSON.parseObject(params, Brand.class);

        PageBean<Brand> pageBean = brandService.selectByPageAndCondition(currentPage, pageSize,brand);

        String jsonString = JSON.toJSONString(pageBean);

        response.getWriter().write(jsonString);
    }
}
