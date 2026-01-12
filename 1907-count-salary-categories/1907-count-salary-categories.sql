SELECT 'Low Salary' AS category,
       COUNT(income) accounts_count from accounts
where income < 20000

UNION ALL
SELECT 'Average Salary' AS category,
        COUNT(income) accounts_count from accounts
where income between 20000 and 50000
UNION ALL
SELECT 'High Salary' AS category,
       COUNT(income) accounts_count from accounts
where income > 50000