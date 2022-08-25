-- delete tb_brand table
drop table if exists tb_brand;
-- create tb_brand table
create table tb_brand
(
   
    id           int primary key auto_increment,

    brand_name   varchar(20),
   
    company_name varchar(20),
   
    ordered      int,

    description  varchar(100),
 
    status       int
);
-- Add data
insert into tb_brand (brand_name, company_name, ordered, description, status)
values 
       ('Huawei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Oneplus', 'Oneplus llc', 5, 'it is new', 0),
       ('Huaiwei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1),
       ('Huaiwei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Oneplus', 'Oneplus llc', 5, 'it is new', 0),
       ('Huaiwei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1),
       ('Huaiwei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Oneplus', 'Oneplus llc', 5, 'it is new', 0),
       ('Huaiwei', 'Huaiweitech Inc.', 100, 'connect everything together', 1),
       ('Xiaomi', 'Xiaomi tech llc.', 50, 'are you ok', 1),
       ('Google', 'Googletech inc.', 30, 'pixel is awesome', 1),
       ('Alibaba', 'Alibabacorp', 10, 'buy buy buy', 1),
       ('Apple', 'Applecompany', 50, 'iphone is popular', 0),
       ('samsung', 'samsungsamsung corp', 5, 'beautiful', 0),
       ('Amazon', 'Amazon Inc.', 40, 'fast', 1)
        ;
   

SELECT * FROM tb_brand;