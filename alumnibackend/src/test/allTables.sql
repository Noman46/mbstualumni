CREATE TABLE applicationForm (
	applicationId IDENTITY,
	studentName VARCHAR(50),
	fatherName VARCHAR(50),
	motherName VARCHAR(50),
	studentDOB TIMESTAMP, 
	studentemail VARCHAR(50),
	phone VARCHAR(30),
	hscBoard VARCHAR(30) NOT NULL,
	hscRoll VARCHAR(30) NOT NULL,
	versitySession VARCHAR(30) NOT NULL,
	versityId VARCHAR(30) NOT NULL,
	isActive BOOLEAN,
	gender VARCHAR(10),
	created_at TIMESTAMP,
	updated_at TIMESTAMP,
   
    CONSTRAINT pk_applicationForm_applicationId PRIMARY KEY(applicationId),
    UNIQUE KEY applicationForm_versityId (versityId),
);

INSERT INTO applicationForm (applicationId,studentName,fatherName,motherName,birthday,email,phone,hscBoard,hscRoll,versitySession,versityId,isActive,gender,created_at,updated_at) 
VALUES (7,'Noman','md','nz',NOW(),'ju@gmail.com','8687','test','8828828','2011-2012','IT-12046',true,'male',NOW(),NOW());


//------------------- ADMIN INFORMATION --------------------------------------//
CREATE TABLE admininformation(
    adminId IDENTITY,
    adminName VARCHAR(50),
    gender VARCHAR(10),
    adminProfessionId VARCHAR(20),
    adminFatherName VARCHAR(50),
    adminDob TIMESTAMP,
    adminMobile VARCHAR(30),
    adminEmail VARCHAR(50),
    adminPassword VARCHAR(255),
    adminUsername VARCHAR(50),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    PRIMARY KEY(adminId)
);

INSERT INTO adminInformation (adminId,adminName,gender,adminProfessionId,adminFatherName,adminDob,adminMobile,adminEmail,adminPassword,adminUsername,created_at,updated_at) 
VALUES (1,'Noman','M','ICT345','Mostafa',NOW(),'868776766','test@mail.com','8828828','Uname',NOW(),NOW());



// --------------------- ADMIN LOGGED INFORMTAION ------------------------------- //

CREATE TABLE adminLogInfo(
	admin_log_id IDENTITY,
	adminId VARCHAR(20),
	logged_in_time TIMESTAMP,
	logged_out_time TIMESTAMP,
	
	PRIMARY KEY (admin_log_id),
	FOREIGN KEY (adminId) REFERENCES adminInformation(adminId)

)

// ----------------------------------------------------------------------------

// --------------------- Student Job Information Table ------------------------------- //

At first i create the table using the following SQL

CREATE TABLE studentJobInformation(
	    jobInfoId  INT NOT NULL IDENTITY,
	    applicationId INT NULL,
	    verifiedStudentVersityId VARCHAR(100) NULL,
        companyName1 VARCHAR(40) NULL,
        jobPosition1 VARCHAR(20) NULL,
        jobDuration1 VARCHAR(20) NULL,
        companyName2 VARCHAR(40) NULL,
        jobPosition2 VARCHAR(20) NULL,
        jobDuration2 VARCHAR(20) NULL,
        companyName3 VARCHAR(40) NULL,
        jobPosition3 VARCHAR(20) NULL,
        jobDuration3 VARCHAR(20) NULL,
        companyName4 VARCHAR(40) NULL,
        jobPosition4 VARCHAR(20) NULL,
        jobDuration4 VARCHAR(20) NULL,
        favouriteQoute VARCHAR(150) NULL,
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (jobInfoId),
	    FOREIGN KEY (applicationId) REFERENCES applicationForm(applicationId)
        
)





ALTER TABLE studentJobInformation ADD FOREIGN KEY (versityId) REFERENCES applicationForm(versityId);


// ------------------------------- +++++++++++++ -------------------------------------------------------


CREATE TABLE studentPersonalInformation(
	    personalInfoId INT NOT NULL IDENTITY,
	    applicationId INT NULL,
	    verifiedStudentVersityId VARCHAR(100) NULL,
        studentHobby VARCHAR(40) NULL,
        studentBlog VARCHAR(100) NULL,
        studentVlog VARCHAR(100) NULL,
        studentBloodGroup VARCHAR(10) NULL,
        studentGit VARCHAR(100) NULL,
        studentFb VARCHAR(100) NULL,
        studentLinkedin VARCHAR(100) NULL,
        studentIn VARCHAR(100) NULL,
        studentTwt VARCHAR(100) NULL,
        studentBooks VARCHAR(400) NULL,
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (personalInfoId),
	    FOREIGN KEY (applicationId) REFERENCES applicationForm(applicationId)
        
)
//------------------------------ +++ Verified Student +++ -----------------------------------------
CREATE TABLE verifiedStudent(
	    verifiedStudentId INT NOT NULL IDENTITY,
	    applicationId INT NULL,
        verifiedStudentEmail VARCHAR(40) NULL,
        verifiedStudentPassword VARCHAR(100) NULL,
        verifiedStudentVersityId VARCHAR(100) NULL,
        
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (verifiedStudentId),
	    FOREIGN KEY (applicationId) REFERENCES applicationForm(applicationId)
        
)
INSERT INTO verifiedstudent(verifiedStudentId,applicationId,verifiedStudentEmail,verifiedStudentPassword,verifiedStudentVersityId,created_at,updated_at) 
VALUES (7,42,'noman@mail.com','1234','IT-12046',NOW(),NOW());

//-------------------------- +++ STUDENT IMAGE TABLE +++ ----------------------------------------

CREATE TABLE studentImages(
	    studentImageId INT NOT NULL IDENTITY,
	    applicationId INT NULL,
	    verifiedStudentVersityId VARCHAR(100) NULL,
        code VARCHAR(40) NULL, 
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (studentImageId),
	    FOREIGN KEY (applicationId) REFERENCES applicationForm(applicationId)
        
)
INSERT INTO studentImages(studentImageId,applicationId,verifiedStudentVersityId,code,created_at,updated_at) 
VALUES (4,42,'IT-12046','STU03EA3E27F2',NOW(),NOW());

//------------------------------ +++ POST TABLES +++ -------------------------------------

CREATE TABLE studentPost(
	    postId INT NOT NULL IDENTITY,
	    applicationId INT NULL,
	    verifiedStudentVersityId VARCHAR(100) NULL,
        post VARCHAR(1500) NOT NULL, 
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (postId),
	    FOREIGN KEY (applicationId) REFERENCES applicationForm(applicationId)
        
)
INSERT INTO studentPost(postId,applicationId,verifiedStudentVersityId,post,created_at,updated_at)
VALUES(1,42,'IT-12046','This Is a test Post',NOW(),NOW());

//------------------------------ +++ Follow +++ ------------------------------

CREATE TABLE follow(
	    followId INT NOT NULL IDENTITY,
	    applicationId INT NOT NULL,
        verifiedStudentEmail VARCHAR(40) NULL,
        followingID INT NOT NULL,
        isFollowing VARCHAR(10) NOT NULL,
        
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (followId),
	    
        
)
INSERT INTO follow(followId,applicationId,verifiedStudentEmail,followingID,isFollowing,created_at,updated_at)
VALUES(1,42,'IT-12046',43,'YES',NOW(),NOW())
//-------------------------------- +++ LIKE TABLE +++ ----------------------------------

CREATE TABLE likes(
	    likeId INT NOT NULL IDENTITY,
	    applicationId INT NOT NULL,
        postId INT NOT NULL, 
        created_at TIMESTAMP,
	    updated_at TIMESTAMP,
	
	    PRIMARY KEY (likeId),
	    FOREIGN KEY (postId) REFERENCES studentPost(postId)
	    
        
)
// ------------------------------ +++ MBSTU IMAGE +++ ---------------------------------------------

CREATE TABLE mbstuImages(
	    mbstuImageId INT NOT NULL IDENTITY,
        imageCode VARCHAR(40) NULL,
        likes INT(20),
        created_at TIMESTAMP,
	   
	
	    PRIMARY KEY (mbstuImageId)       
)
