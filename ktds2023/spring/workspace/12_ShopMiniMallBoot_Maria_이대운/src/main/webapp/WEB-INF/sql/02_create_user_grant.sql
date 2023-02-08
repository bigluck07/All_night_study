
DROP USER IF EXISTS shop;

-- CREATE USER SHOP
CREATE USER shop @'%' IDENTIFIED BY 'shop';

-- GRANT TO SHOP USER
GRANT ALL PRIVILEGES ON SHOP.* TO shop @'%';