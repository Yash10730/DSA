-- Write your PostgreSQL query statement below
select c.id, c.movie, c.description, c.rating from Cinema As c  
where c.id % 2 != 0 AND c.description <> 'boring'
  order by c.rating desc;