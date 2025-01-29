/* Write your PL/SQL query statement below */
select p.product_name,sum(o.unit) AS unit from
products p
JOIN
orders o
on p.product_id=o.product_id
where o.order_date>='2020-02-01' and o.order_date<='2020-02-29' 
group by p.product_id,p.product_name
HAVING sum(o.unit)>=100 ;
;