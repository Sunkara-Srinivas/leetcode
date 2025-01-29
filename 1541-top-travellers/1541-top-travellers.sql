# Write your MySQL query statement below
# Write your MySQL query statement below
select U.name, IFNULL(sum(R.distance),0) as travelled_distance from Users U
left join Rides R on R.user_id=U.id
group by U.id
order by travelled_distance desc, name asc;