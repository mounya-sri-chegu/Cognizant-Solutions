
CREATE TABLE users(
  user_id INT PRIMARY KEY,
  full_name VARCHAR(100) NOT NULL,
  email VARCHAR(255) NOT NULL,
  city VARCHAR(100) NOT NULL,
  registration_date DATE,
  UNIQUE(email)
);

INSERT INTO users(user_id, full_name, email, city, registration_date)VALUES (1, 'Alice Johnson', 'alice@example.com', 'New York', '2024-12-01');

INSERT INTO users(user_id, full_name, email, city, registration_date)VALUES (2, 'Bob Smith', 'bob@example.com', 'Los Angeles', '2024-12-05');

INSERT INTO users(user_id, full_name, email, city, registration_date)VALUES (3, 'Charlie Lee', 'charlie@example.com', 'Chicago', '2024-12-10');

INSERT INTO users(user_id, full_name, email, city, registration_date)VALUES (4, 'Diana King', 'diana@example.com', 'New York', '2025-01-15');

INSERT INTO users(user_id, full_name, email, city, registration_date)VALUES (5, 'Ethan Hunt', 'ethan@example.com', 'Los Angeles', '2025-02-01');

select * from users;

CREATE TABLE Events (
  event_id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(200) NOT NULL,
  description TEXT,
  city VARCHAR(100) NOT NULL,
  start_date DATETIME NOT NULL,
  end_date DATETIME NOT NULL,
  status ENUM('upcoming', 'completed', 'cancelled'),
  organizer_id INT,
  FOREIGN KEY (organizer_id) REFERENCES users(user_id)
);
INSERT INTO Events(event_id,title,description,city,start_date,end_date,status,organizer_id) VALUES(1,'Tech Innovators Meetup','A meetup for tech enthusiasts','New York','2025-06-10  10:00:00','2025-06-10 16:00:00','upcoming',1);
INSERT INTO Events(event_id,title,description,city,start_date,end_date,status,organizer_id) VALUES(2,'AI & ML Conference','Conference on AI and ML advancements','Chicago','2025-05-15 9:00:00','2025-05-15 17:00:00','completed',3);
INSERT INTO Events(event_id,title,description,city,start_date,end_date,status,organizer_id) VALUES(3,'Frontend Development Bootcamp','Hands-on training on frontend tech','Los Angeles','2025-07-01 10:00:00','2025-07-03 16:00:00','upcoming',2);

select * from Events;


CREATE TABLE Sessions(
session_id INT PRIMARY KEY,
event_id INT ,
title VARCHAR(200) NOT NULL,
speaker_name VARCHAR(100) NOT NULL,
start_time DATETIME NOT NULL,
end_time DATETIME NOT NULL,
FOREIGN KEY (event_id) REFERENCES Events(event_id)
);

INSERT INTO Sessions (session_id,event_id,title,speaker_name,start_time,end_time) VALUES(1,1,'Opening Keynote','Dr.Tech','2025-06-10 10:00:00','2025-06-10 11:00:00');
INSERT INTO Sessions (session_id,event_id,title,speaker_name,start_time,end_time) VALUES(2,1,'Future of Web Dev','Alice Johnson','2025-06-10 11:15:00','2025-06-10 12:30:00');
INSERT INTO Sessions (session_id,event_id,title,speaker_name,start_time,end_time) VALUES(3,2,'AI in Healthcare','Charlie Lee','2025-05-15 09:30:00','2025-05-15 11:00:00');
INSERT INTO Sessions (session_id,event_id,title,speaker_name,start_time,end_time) VALUES(4,3,'Intro to HTML5','Bob Smith','2025-07-01 10:00:00','2025-07-01 12:00:00');

select * from Sessions;


CREATE TABLE Registrations(
registration_id INT PRIMARY KEY,
user_id INT ,
event_id INT,
registration_date DATE NOT NULL,
FOREIGN KEY (user_id) REFERENCES users(user_id),
FOREIGN KEY (event_id) REFERENCES Events(event_id)
);

INSERT INTO Registrations(registration_id,user_id,event_id,registration_date) VALUES(1,1,1,'2025-05-01');
INSERT INTO Registrations(registration_id,user_id,event_id,registration_date) VALUES(2,2,1,'2025-05-02');
INSERT INTO Registrations(registration_id,user_id,event_id,registration_date) VALUES(3,3,2,'2025-04-30');
INSERT INTO Registrations(registration_id,user_id,event_id,registration_date) VALUES(4,4,2,'2025-04-28');
INSERT INTO Registrations(registration_id,user_id,event_id,registration_date) VALUES(5,5,3,'2025-06-15');

select * from Registrations;

CREATE TABLE Feedback(
feedback_id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT ,
event_id INT,
rating INT,
comments TEXT,
feedback_date DATE NOT NULL,
FOREIGN KEY (user_id) REFERENCES users(user_id),
FOREIGN KEY (event_id) REFERENCES Events(event_id),
CHECK(rating BETWEEN 1 AND 5)
);

INSERT INTO Feedback (feedback_id,user_id,event_id,rating,comments,feedback_date) VALUES(1,3,2,4,'Great insights!','2025-05-16');
INSERT INTO Feedback (feedback_id,user_id,event_id,rating,comments,feedback_date) VALUES(2,4,2,5,'Very informative','2025-05-16');
INSERT INTO Feedback (feedback_id,user_id,event_id,rating,comments,feedback_date) VALUES(3,2,1,3,'Could be better','2025-06-11');

select * from Feedback;

CREATE TABLE Resources(
resource_id INT PRIMARY KEY,
event_id INT,
resource_type ENUM ('pdf','image','link'),
resource_url VARCHAR(255) NOT NULL,
uploaded_at DATETIME NOT NULL,
FOREIGN KEY (event_id) REFERENCES Events(event_id)

);

INSERT INTO Resources(resource_id,event_id,resource_type,resource_url,uploaded_at) VALUES(1,1,'pdf','https://portal.com/resources/tech_meetup_agenda.pdf','2025-05-01 10:00:00');
INSERT INTO Resources(resource_id,event_id,resource_type,resource_url,uploaded_at) VALUES(2,2,'image','https://portal.com/resources/ai_poster.jpg','2025-04-20 09:00:00');
INSERT INTO Resources(resource_id,event_id,resource_type,resource_url,uploaded_at) VALUES(3,3,'link','https://portal.com/resources/html5_docs','2025-06-25 15:00:00');

select *from Resources;


















-- user upcoming Events
select users.full_name, Events.city,Events.title from users 
join Registrations ON users.user_id=Registrations.user_id
join Events on Events.event_id =Registrations.event_id
where users.city=Events.city and Events.status='upcoming' 
ORDER BY Events.start_date;

select * from users 
join Registrations ON users.user_id=Registrations.user_id 
join Events on Events.event_id =Registrations.event_id
where Events.city=users.city and status='upcoming'
order by start_date;

-- Top Rated Events
select title,avg(rating) as avg_rating ,count(feedback_id) as feedback_count from Events
join Feedback on Events.event_id=Feedback.event_id
group  by Events.title
having feedback_count>=10
order by avg_rating desc;

-- Inactive Users
select full_name,DATEDIFF(current_date,Registrations.registration_date) as inactive_days from users
join Registrations on users.user_id=Registrations.user_id

where DATEDIFF(current_date,Registrations.registration_date)>=90;


-- Peak Session Hours
select count(session_id) as sessions from Sessions
join Events on Events.event_id=Sessions.event_id
where TIME(start_time) >='10:00:00' and TIME(end_time)<='12:00:00';

-- Most Active Cities
select city ,count(users.user_id) from users 
join Registrations on Registrations.user_id=users.user_id
group by city
order by count(user_id) desc
limit 5;

-- Event Resource Summary
select resource_type,Events.title, count(resource_id) from Resources
join Events on Events.event_id=Resources.event_id
group by resource_id;



--  Low Feedback Alerts
select Events.title,comments,rating from Feedback
join Events on Events.event_id =Feedback.event_id
where rating<=3;

-- Sessions per Upcoming Event
select Events.title ,count(Sessions.session_id )from Sessions 
join Events on Events.event_id=Sessions.event_id
where Events.status='upcoming'
group by Events.title,Events.event_id
having count(Sessions.session_id);


-- Organizer Event Summary
select organizer_id,count(Events.event_id),Events.status from Events
join Sessions on Sessions.event_id=Events.event_id
group by Events.event_id,Events.organizer_id,Events.status
order by organizer_id;

--  Feedback Gap
select * from Events
join Registrations on Registrations.event_id=Events.event_id
where Events.event_id NOT in(select Feedback.event_id from Feedback);


-- Daily New User Count
select count(user_id) from Registrations
where registration_date>=current_date-interval 7 day
group by registration_date;

--  Event with Maximum Sessions
select Events.title,Events.event_id ,count(Sessions.session_id) from Events
join Sessions on Sessions.event_id=Events.event_id
group by Events.event_id
order by count(Sessions.session_id) desc
limit 1;



-- Average Rating per City

select Events.city,Events.title,AVG(Feedback.rating) from Events

join Feedback on Feedback.event_id=Events.event_id
group by Events.city,Events.event_id;


-- Most Registered Events
select Events.title,Events.event_id,count(Registrations.registration_id) from Events
join Registrations on Registrations.event_id=Events.event_id
group by Events.event_id
order by count(Registrations.registration_id) desc
limit 3;

-- Event Session Time Conflict
SELECT 
    s1.session_id AS session1_id,
    s1.title AS session1_title,
    s2.session_id AS session2_id,
    s2.title AS session2_title,
    s1.event_id,
    s1.start_time AS s1_start,
    s1.end_time AS s1_end,
    s2.start_time AS s2_start,
    s2.end_time AS s2_end
FROM Sessions s1
JOIN Sessions s2 
    ON s1.event_id = s2.event_id 
    AND s1.session_id < s2.session_id  -- avoid duplicate pairs and self-joins
WHERE 
    s1.start_time < s2.end_time 
    AND s2.start_time < s1.end_time;


-- Unregistered Active Users
select users.full_name from users

where users.registration_date >=current_date -interval 30 day and
users.user_id not in(select user_id from Registrations);

-- Multi-Session Speakers
select speaker_name ,count(*) as session_count from Sessions
group by speaker_name
having session_count>1;

-- Resource Availability Check
select Events.title from Events
join Resources on Resources.event_id=Events.event_id
where Resources.resource_type IS NULL;


-- Completed Events with Feedback Summary
select Events.title,Events.event_id , count(Registrations.registration_id),avg(Feedback.rating) from Events
join Registrations on Registrations.event_id=Events.event_id
join Feedback on Feedback.event_id=Events.event_id
where Events.status='completed'
group by Events.title,Events.event_id;


-- User Engagement Index
select users.full_name ,count(Registrations.registration_id) ,count(Feedback.feedback_id)from users

left join Registrations on Registrations.user_id=users.user_id
left join Feedback on Feedback.user_id=users.user_id
group by users.user_id;


-- Top Feedback Providers
select users.full_name ,count(Feedback.feedback_id) from users
join Feedback on Feedback.user_id=users.user_id 
group by users.full_name,users.user_id
order by count(Feedback.feedback_id) desc
limit 5;


-- Duplicate Registrations Check
select users.full_name ,count(Registrations.registration_id)from users
join Registrations on Registrations.user_id=users.user_id
join Events on Events.event_id=Registrations.event_id
group by users.full_name,Registrations.event_id
having count(Registrations.registration_id)>1;


/*-- Registration Trends
SELECT DATE_FORMAT(registration_date, '%Y-%m') AS year_month,COUNT(*) AS registration_count FROM Registrations
WHERE registration_date >= current_date() - INTERVAL 12 MONTH
GROUP BY DATE_FORMAT(registration_date, '%Y-%m')
ORDER BY year_month;*/

-- Average Session Duration per Event
select Sessions.title ,avg(timestampdiff(minute,Sessions.start_time ,Sessions.end_time)) as duration from Sessions
join Events on Events.event_id=Sessions.event_id
group by Sessions.title;


-- Events Without Sessions
select Events.event_id ,Events.title from Events
left join Sessions on Sessions.event_id = Events.event_id
where Sessions.session_id IS NULL;



