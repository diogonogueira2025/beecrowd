SELECT p.name, pv.name, p.price
FROM products AS p
INNER JOIN providers AS pv ON p.id_providers = pv.id
INNER JOIN categories AS c ON p.id_categories = c.id
WHERE p.price > 1000 AND c.name = 'Super Luxury';