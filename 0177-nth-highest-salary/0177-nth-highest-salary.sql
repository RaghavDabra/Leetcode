CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
SET M = N-1;
  RETURN (
      Select 
      IFNULL((SELECT Distinct Salary 
              From Employee 
              order by salary desc 
              limit 1 offset M),null)
      
  );
END