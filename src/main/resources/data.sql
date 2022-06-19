INSERT IGNORE INTO provider(provider_name, provider_code) VALUES
('Shopee', 'SHOPEE');
INSERT IGNORE INTO user_info(user_id, email, display_name, image, status) VALUES (1,'trivip002@gmail.com','$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6','avatar.png',1);
INSERT IGNORE INTO role(role_id,code,name) VALUES (1,'ADMIN','Admin Role'),(2, 'RUSER','User Role');
INSERT IGNORE INTO user_role(user_id,role_id) VALUES (1,1),(1,2);