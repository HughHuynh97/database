INSERT IGNORE INTO crawl_request(request_id, url, code)
VALUES (1,'https://shopee.vn/api/v4/search/search_items','GET_PRODUCT_BY_CAT'),
       (2,'https://shopee.vn/api/v4/pages/get_category_tree','GET_ALL_CATEGORY'),
       (3,'https://shopee.vn/api/v4/item/get','GET_PRODUCT_DETAIL');