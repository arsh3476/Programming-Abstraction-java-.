/* Write your T-SQL query statement below */
SELECT name,population, area

from World 
where area>= 3000000 OR Population>= 25000000
