
select city, first_name, salary
  from employees e, departments d, locations l
 where e.department_id = d.department_id
   and d.location_id = l.location_id
   and city like '%attle%'
   and salary >= 15000;
   
select city, first_name, salary
  from employees e, departments d, locations l
 where e.department_id = d.department_id
   and d.location_id = l.location_id
   and city like '%cisco%'
   and salary >= 6000;
  
select department_name, manager_id
  from departments
 where department_id = 110;
 