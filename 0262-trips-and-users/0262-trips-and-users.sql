SELECT
    request_at AS Day,
    ROUND(SUM(status LIKE "cancelled%") / COUNT(*),2) AS  'Cancellation Rate'
FROM trips
WHERE request_at between "2013-10-01" and "2013-10-03"
AND
client_id IN (
	SELECT
		users_id
	FROM users
	WHERE banned <> "Yes")
AND
driver_id IN (
	SELECT
		users_id
	FROM users
	WHERE banned <> "Yes")
GROUP BY request_at;