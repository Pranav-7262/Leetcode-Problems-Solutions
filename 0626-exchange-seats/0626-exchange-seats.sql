select case
when mod(id,2) = 0 then id-1
when mod(id,2) = 1 and id+1
not in(select id from Seat) then id
else id+1 end as id , student
from Seat
order by id