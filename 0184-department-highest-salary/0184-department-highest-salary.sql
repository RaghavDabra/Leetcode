select A.Department, A.Employee, A.Salary from
(select b.name as Department, a.name as Employee, a.salary as Salary, dense_rank() over(partition by b.name order by a.salary desc) as rn from Employee as a
join Department as b
on a.departmentId=b.id
) as A
where rn=1;