# Write your MySQL query statement below
select employee_id,salary * (employee_id %2=1) * (LEFT(name,1) != 'M') as bonus from employees  order by employee_id;