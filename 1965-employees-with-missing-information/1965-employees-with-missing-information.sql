# Write your MySQL query statement below
select employee_id from (select E.employee_id,E.name as name,S.salary as salary from Employees E left outer join Salaries S on E.employee_id=S.employee_id
union all
select S.employee_id,E.name as name,S.salary as salary from Employees E right outer join Salaries S on E.employee_id=S.employee_id) as Merged where name is null or salary is null order by employee_id