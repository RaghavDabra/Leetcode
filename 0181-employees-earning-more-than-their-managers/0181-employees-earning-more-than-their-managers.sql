SELECT e.name AS 'Employee'
FROM Employee e, Employee m 
WHERE e.managerId = m.id && e.salary > m.salary;