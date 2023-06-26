-- 코드를 입력하세요
select o.user_id, o.product_id
from (
    select *, count(product_id) as cnt
    from online_sale
    group by user_id, product_id
    having cnt > 1
    order by user_id asc, product_id desc
) as o;