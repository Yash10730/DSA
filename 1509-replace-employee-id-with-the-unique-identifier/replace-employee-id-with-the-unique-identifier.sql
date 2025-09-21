SELECT e2.unique_id,e1.name
FROM Employees e1
Left JOIN EmployeeUNI e2
ON e1.id = e2.id;
