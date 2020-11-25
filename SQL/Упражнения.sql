# 1. Брой на потребители
select count(id)from users;

# 2. Най-стария потребител
select  username, birthdate from users order by birthdate asc;

# 3. Най-младия потребител
select username,birthdate from users order by birthdate desc;

#4. Колко юзъра са регистрирани с мейли от abv и колко от gmail и колко 
#с различни от двата
select count(email)from users where email like '%abv%';
select count(email)from users where email like '%gmail%';
select count(email) from users where email not like'%abv%' or '%gmail%';

# 5. Кои юзъри са banned
select username,isbanned from users where isbanned=1;

# 6. Изкарайте всички потребители от базата като ги наредите по име в азбучен ред и дата на раждане
# (от най-младия към най-възрастния).
select username,birthdate from users  order by  username, birthdate desc;

# 7.Изкарайте всички потребители от базата, на които потребителското име започва с a
select username from users where username like'a%';

# 8. Изкарайте всички потребители от базата, които съдържат а в 
# username името си
select username from users where username like'%a%';

# 9. Изкарайте всички потребители от базата, чието име се състои от 2 имена
select * from users where username like ('%' '%');

# 10. Регистрирайте 1 юзър през UI-а и го забранете след това от базата
update users set username='1' where username='Tatyana4';

# 11. Брой на всички постове
select count(*) from posts;

# 12. Брой на всички постове групирани по статуса на post-a
select * from posts order by poststatus;
select postStatus, count(*) from posts group by postStatus;

# 13. Намерете поста/овете с най-къс caption
select caption from posts order by caption asc;
select min(caption) from posts;

# 14. Покажете поста с най-дълъг caption
select max(caption) from posts;
select min(caption) as shortescaption from posts;
select caption from posts order by caption desc;
select max(caption) as longestcaption from posts;
select min(caption) from posts;

# 15. Кой потребител има най-много постове. Използвайте join заявка.
select users.username, count(*) as posts from users left join posts on user.id=posts.userId
group by username order by posts desc limit 1;

# 16.Кои потребители имат най-малко постове. Използвайте join заявка.
select users.username, count(*) as posts from users left join posts on users.id=posts.userId group by username
order by posts limit 1;

#17. Колко потребителя с по 1 пост имаме. Използвайте join заявка, having clause и вложени заявки.
select count(username) from (select users.username, count(*) as posts from users left join posts 
on users.id=post.userId group by username having (posts = 1));

# 18. Колко потребителя с по малко от 5 поста имаме. Използвайте join заявка, having clause и вложени заявки.
select count(username) from(select users.username, count(*) as posts from users left join posts 
on users.id=posts.userId group by username having (posts < 5));

# 19. Кои са постовете с най-много коментари. Използвайте вложена заявка и where clause.
select * from posts where commentsCount = (select max(commentsCount) from posts);

# 20. Покажете най-стария пост. Може да използвате order или с aggregate function.
select createdAt from posts order by createdAt asc limit 1;

# 21. Покажете най-новия пост. Може с order или с aggregate function.
select createdAt from posts order by createddAt desc limit 1;

# 22. Покажете всички постове с празен caption.
select caption from posts where caption like '!';
select caption from posts where caption=' ';

