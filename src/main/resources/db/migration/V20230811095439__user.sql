create table user1 (
    chat_id BIGSERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    username TEXT,
    registered_at timestamp);