SELECT 
    summed.stock_name,
    SUM(summed.price) AS capital_gain_loss
FROM (
    SELECT 
        stock_name,
        CASE
            WHEN operation = 'Buy' THEN -price
            WHEN operation = 'Sell' THEN price
        END as price
    FROM Stocks
) AS summed
GROUP BY summed.stock_name