# Write your MySQL query statement below
select e1.name AS employee from employee e1
JOIN 
employee e2
on e1.managerid=e2.id
where e1.salary>e2.salary;