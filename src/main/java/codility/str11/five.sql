SELECT
    a.experience as exp,
    SUM(
        CASE WHEN
            (COALESCE(a.sql, 0) +
            COALESCE(a.algo, 0) +
            COALESCE(a.bug_fixing, 0)) / 200 >= 1 THEN 1
        ELSE 0
        END
    ) as max,
    count(a.*) as count
from assessments a
group by a.experience
order by a.experience desc;