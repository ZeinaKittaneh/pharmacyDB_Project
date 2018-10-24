drop table employee cascade constraints;
drop table medications cascade constraints;
drop table transactions cascade constraints;
drop table clients cascade constraints;
drop table positions cascade constraints;
drop table qualification cascade constraints;
drop table orders cascade constraints;
drop table orders_have_medications cascade constraints;
drop table accounts cascade constraints;

CREATE TABLE employee( 
  EmployeeId    NUMBER (4),
  Lname		VARCHAR2 (20) CONSTRAINT employee_lname_nn NOT NULL,
  Fname 	VARCHAR2 (20) CONSTRAINT employee_fname_nn NOT NULL, 
  PositionId 	NUMBER (2),
  Cell      CHAR(10),
  Address   VARCHAR2(60),
  Salary		NUMBER (6),
  QualId    CHAR(4),
  CONSTRAINT employee_employeeid_pk PRIMARY KEY (EmployeeId) 
);

CREATE TABLE positions
	(PositionId	NUMBER (2),
	PosDesc	VARCHAR2 (30),
	CONSTRAINT positions_positionid_pk PRIMARY KEY (PositionId)
);

CREATE TABLE qualification
	(QualId	CHAR (4),
	QualDesc	VARCHAR2 (30),
	CONSTRAINT qualification_qualid_pk PRIMARY KEY (QualId)
);
  

CREATE TABLE clients
  (HCN CHAR(12),
  CLname		VARCHAR2 (20) CONSTRAINT clients_CLname_nn NOT NULL,
  CFname		VARCHAR2 (20) CONSTRAINT clients_CFname_nn NOT NULL,
  DOB DATE,
  Cell  NUMBER (10),
  address VARCHAR2 (40),
  CONSTRAINT clients_HCN_pk PRIMARY KEY (HCN)
);

CREATE Table medications 
  (mid NUMBER(8),
  mname VARCHAR2(20),
  effect VARCHAR2(30),
  dosage VARCHAR2(15),
  generic VARCHAR2(20),
  price NUMBER(5),
  quantity NUMBER(3),
  CONSTRAINT medications_mid_pk PRIMARY KEY (mid)
);

CREATE Table transactions 
  (tid NUMBER(4),
  HCN CHAR(12),
  mid NUMBER(8),
  EmployeeId    NUMBER (4),
  tdate DATE,
  units NUMBER(3),
  CONSTRAINT transactions_tid_pk PRIMARY KEY (tid)
);

CREATE Table orders 
  (order_id NUMBER(5),
  company VARCHAR2(30),
  amount NUMBER(5),
  total_price NUMBER(6),
  odate DATE,
  CONSTRAINT orders_order_id_pk PRIMARY KEY (order_id)
);

CREATE Table orders_have_medications 
  (order_id  NUMBER(5),
  mid NUMBER(8),
  CONSTRAINT ord_med_order_id_mid__pk PRIMARY KEY (order_id,mid)
);

CREATE Table accounts
  (EmployeeId NUMBER(4),
  passwords VARCHAR2(20),
  CONSTRAINT accounts_eid_pk PRIMARY KEY (Employeeid)

  );

----------------------------------------------------
  
ALTER TABLE employee
ADD CONSTRAINT employee_PositionId_fk FOREIGN KEY (PositionId)
      REFERENCES positions (PositionId);

ALTER TABLE employee
ADD CONSTRAINT employee_QualId_fk FOREIGN KEY (QualId)
		REFERENCES qualification (QualId);
  
ALTER TABLE transactions
ADD CONSTRAINT transactions_HCN_fk FOREIGN KEY (HCN)
		REFERENCES clients (HCN) on delete cascade;
ALTER TABLE transactions
ADD CONSTRAINT transactions_mid_fk FOREIGN KEY (mid)
    REFERENCES medications (mid);
ALTER TABLE transactions
ADD CONSTRAINT transactions_EmployeeId_fk FOREIGN KEY (EmployeeId )
		REFERENCES employee (EmployeeId) on delete cascade;

ALTER TABLE orders_have_medications 
ADD  CONSTRAINT ord_med_order_id_fk FOREIGN KEY (order_id)
		REFERENCES orders (order_id);
ALTER TABLE orders_have_medications 
ADD CONSTRAINT ord_med_mid_fk FOREIGN KEY (mid)
		REFERENCES medications (mid);
        
ALTER TABLE accounts
ADD CONSTRAINT accounts_EmployeeId_fk FOREIGN KEY (EmployeeId )
		REFERENCES employee (EmployeeId) on delete cascade;
        
--------------------------------------------------------------------------------

INSERT INTO positions VALUES (1, 'Chief Pharmacist');
INSERT INTO positions VALUES (2, 'Assistant Pharmacist');
INSERT INTO positions VALUES (3, 'Cashier');

INSERT INTO qualification VALUES ('q1', 'Masters');
INSERT INTO qualification VALUES ('q2', 'Bachelor');
INSERT INTO qualification VALUES ('q3', 'DEC');

INSERT INTO employee VALUES (1111, 'Luke', 'Latifah', 1, 514633987, 
	'1230 Saint-Denis street, Montreal, Canada', 100000, 'q1');
INSERT INTO employee VALUES (2222, 'Houston', 'Larry', 2, 514111222, 
	'2255 Crescent street, Montreal, Canada',50000 , 'q2');
INSERT INTO employee VALUES (3333, 'Roberts', 'Sandi', 2, 514222333, 
	'1200 The King Road street, Montreal, Canada', 55100, 'q2');
INSERT INTO employee VALUES (4444, 'McCall', 'Alex', 2, 514333444, 
	'3300 Boulevard Saint-Laurent, Montreal, Canada', 60000, 'q2');
INSERT INTO employee VALUES (5555, 'Dev', 'Derek', 3, 51444555, 
	'4400 Saint Paul street, Montreal, Canada', 23000, 'q3');
INSERT INTO employee VALUES (6666, 'Shaw', 'Jinku', 3, 514555666, 
	'5566 Saint-André street, Montreal, Canada', 24000, 'q3');
INSERT INTO employee VALUES (7777, 'Garner', 'Stanley',3, 514666777, 
	'7788 Castelnau street, Montreal, Canada', 28000, 'q3');

INSERT INTO clients VALUES ('GreA57493421', 'GreenGables', 'Anne', TO_DATE('1945-09-12','yyyy/mm/dd'), 5148330987, 
	'123 Notre Dame, Montreal, Canada');
INSERT INTO clients VALUES ('McpS57490921', 'McPoland', 'Shaun', TO_DATE('1991-09-10','yyyy/mm/dd'), 4389089094, 
	'98 St. Jacques, Montreal, Canada');
INSERT INTO clients VALUES ('WavC57493421', 'WavePool', 'Chad', TO_DATE('1998-08-01','yyyy/mm/dd'), 514836482, 
	'190 St Jacques, Montreal, Canada');
INSERT INTO clients VALUES ('SafN57493421', 'Safari', 'Ngozi', TO_DATE('2000-04-19','yyyy/mm/dd'), 514870209, 
	'789 St. Pierre, Montreal, Canada');
INSERT INTO clients VALUES ('SpaJ57493421', 'Sparrow', 'Jack', TO_DATE('1980-09-05','yyyy/mm/dd'), 438812987, 
	'897 Duffcourt Street, Lachine, Canada');
INSERT INTO clients VALUES ('KetA57493421', 'Ketchum', 'Ash', TO_DATE('1970-01-08','yyyy/mm/dd'), 5148394574, 
	'56 Acadie, Montreal, Canada');

INSERT INTO orders VALUES (32921, 'Algorithme Pharma', 51, 100, TO_DATE('2018-05-23','yyyy/mm/dd'));
INSERT INTO orders VALUES (32922, 'Angiotech Pharmaceuticals', 40, 100, TO_DATE('2018-04-04','yyyy/mm/dd'));
INSERT INTO orders VALUES (32923, 'Antibe Therapeutics', 60, 100, TO_DATE('2018-01-16','yyyy/mm/dd'));
INSERT INTO orders VALUES (32924, 'Apotex', 50, 100, TO_DATE('2018-12-12','yyyy/mm/dd'));
INSERT INTO orders VALUES (32925, 'PainCeptor Pharma', 35, 100, TO_DATE('2018-09-20','yyyy/mm/dd'));
INSERT INTO orders VALUES (32926, 'Algorithme Pharma', 45, 100, TO_DATE('2018-05-23','yyyy/mm/dd'));
INSERT INTO orders VALUES (32927, 'Apotex', 44, 100, TO_DATE('2018-11-20','yyyy/mm/dd'));
INSERT INTO orders VALUES (32928, 'Angiotech Pharmaceuticals', 37, 100, TO_DATE('2018-06-10','yyyy/mm/dd'));
INSERT INTO orders VALUES (32929, 'PainCeptor Pharma', 62, 100, TO_DATE('2018-02-10','yyyy/mm/dd'));
INSERT INTO orders VALUES (32930, 'Algorithme Pharma', 70, 100, TO_DATE('2018-12-24','yyyy/mm/dd'));

INSERT INTO medications VALUES(02244840, 'Aspirin', 'inhibits platelet aggregation', '100mg', 'Cartia',200, 160);
INSERT INTO medications VALUES(02244841, 'Amlodipine', 'antihypertensive', '5mg/daily', 'Norvasc', 40, 300);
INSERT INTO medications VALUES(02244842, 'Glimepiride', 'diabetes mellitus tye 2', '1mg/daily', 'Amaryl', 150, 400);
INSERT INTO medications VALUES(02244843, 'Claritin', 'antihistamine', '10mg/daily', 'Loratidine', 200, 160);
INSERT INTO medications VALUES(02244844, 'Lipitor', 'lipid lowering agent', '20mg/daily', 'Atorvastatin', 40, 155);
INSERT INTO medications VALUES(02244845, 'enalapril', 'antihypertensive', '5mg/daily', 'converter', 30, 15);
INSERT INTO medications VALUES(02244846, 'fexofenadine', 'antihistamine', '180mg/daily', 'telfast', 40, 17);
INSERT INTO medications VALUES(02244847, 'vildagliptin', 'diabetes mellitus type 2', '50mg/daily', 'galvus', 200, 20);
INSERT INTO medications VALUES(02244848, 'rosurvastatin', 'Lipid -lowering agent', '20mg/daily', 'Crestor', 20, 30);
INSERT INTO medications VALUES(02244849, 'ibuprofen', 'relief of pain', '400mg/daily', 'nurofen', 38, 20);
INSERT INTO medications VALUES(02244850, 'diclofenace', 'relief of pain', '100mg/daily', 'voltaren', 50, 30);
INSERT INTO medications VALUES(02244851, 'etoricoxib', 'relief of pain', '90mg/daily', 'arcoxia', 33, 20);
INSERT INTO medications VALUES(02244852, 'esomeprazol ', 'treatment of peptic ulcer', '20mg/daily', 'nexium', 31, 17);
INSERT INTO medications VALUES(02244853, 'omeprazol', 'treatment of peptic ulcer ', '20mg/daily', 'omepra', 18, 29);
INSERT INTO medications VALUES(02244854, 'famotidine', 'treatment of peptic ulcer', '40mg/daily', 'famo', 13, 24);

 
INSERT INTO transactions VALUES(0001, 'GreA57493421', 02244840, 1111, TO_DATE('2017-04-12','yyyy/mm/dd'), 2);
INSERT INTO transactions VALUES(0002, 'WavC57493421', 02244842, 2222, TO_DATE('2018-03-11','yyyy/mm/dd'), 3); 
INSERT INTO transactions VALUES(0003, 'SafN57493421', 02244841, 3333, TO_DATE('2018-12-10','yyyy/mm/dd'), 1);
INSERT INTO transactions VALUES(0004, 'KetA57493421', 02244844, 4444, TO_DATE('2018-01-24','yyyy/mm/dd'), 4);
INSERT INTO transactions VALUES(0005, 'McpS57490921', 02244840, 5555, TO_DATE('2017-09-13','yyyy/mm/dd'), 5);
INSERT INTO transactions VALUES(0006, 'SpaJ57493421', 02244849, 7777, TO_DATE('2017-10-13','yyyy/mm/dd'), 1);

INSERT INTO orders_have_medications VALUES(32921, 02244840);
INSERT INTO orders_have_medications VALUES(32922, 02244841);
INSERT INTO orders_have_medications VALUES(32923, 02244842);
INSERT INTO orders_have_medications VALUES(32924, 02244843);
INSERT INTO orders_have_medications VALUES(32925, 02244844);
INSERT INTO orders_have_medications VALUES(32926, 02244845);
INSERT INTO orders_have_medications VALUES(32927, 02244846);
INSERT INTO orders_have_medications VALUES(32928, 02244847);
INSERT INTO orders_have_medications VALUES(32929, 02244848);
INSERT INTO orders_have_medications VALUES(32930, 02244849);

INSERT INTO accounts VALUES(1111, 'pass');
INSERT INTO accounts VALUES(2222, 'sugarIs_life:3');
INSERT INTO accounts VALUES(3333, '99bottles_of_coca');
INSERT INTO accounts VALUES(4444, 'no1isSafe');
INSERT INTO accounts VALUES(5555, 'zombieGraveyard_00');
INSERT INTO accounts VALUES(6666, 'PoutineSwagger3');
INSERT INTO accounts VALUES(7777, 'Link4President');

--------------------------------------------------------------------------------
select * from clients;