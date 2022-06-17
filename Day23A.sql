CREATE TABLE tbl_employee_list (
    fld_efirst_name VARCHAR(15)
    , fld_emid_name VARCHAR(15)
    , fld_elast_name VARCHAR(15)
    , fld_eage INT
    , fld_ejob_title VARCHAR(15)
    , fld_erate FLOAT(18, 4)
    , fld_department VARCHAR(15)
);

INSERT INTO tbl_employee_list (
    fld_efirst_name
    ,fld_emid_name
    ,fld_elast_name
    ,fld_eage
    ,fld_ejob_title
    ,fld_erate
    ,fld_department )
VALUES ( 
    'Pedro'
    , 'Tanghalan'
    , 'Maliwanag'
    , 21
    , 'Electrician'
    , 480.75
    , 'Maintenance'
);

INSERT INTO tbl_employee_list (
    fld_efirst_name
    ,fld_emid_name
    ,fld_elast_name
    ,fld_eage
    ,fld_ejob_title
    ,fld_erate
    ,fld_department )
VALUES ( 
    'Inday'
    , 'Sagalpot'
    , 'Magdalena'
    , 20
    , 'Office Staff'
    , 520
    , 'Orders'
);

SELECT * FROM tbl_employee_list;

INSERT INTO tbl_employee_list (
    fld_efirst_name
    ,fld_emid_name
    ,fld_elast_name
    ,fld_eage
    ,fld_ejob_title
    ,fld_erate
    ,fld_department )
VALUES ( 
    'Minda'
    , 'Bebang'
    , 'Stallone'
    , 29
    , 'Order Manager'
    , 610
    , 'Orders')
,('Andres'
    , 'Bonifacio'
    , 'Aquino'
    , 27
    , 'Messenger'
    , 610
    , 'Orders');

--Yung salary pala ni Andres dapat katulad nung kay Inday
UPDATE tbl_employee_list
SET
fld_erate = 520
WHERE
fld_efirst_name = 'Andres' && fld_elast_name = 'Aquino';

-- A new version of the employee list with required fields and auto incementing primary key
CREATE TABLE tbl_employee_list_2 (
    fld_eid INT NOT NULL AUTO_INCREMENT
    , fld_efirst_name VARCHAR(15) NOT NULL
    , fld_emid_name VARCHAR(15) NOT NULL
    , fld_elast_name VARCHAR(15) NOT NULL
    , fld_eage INT NOT NULL
    , fld_ejob_title VARCHAR(15) NOT NULL
    , fld_erate FLOAT(18, 4) NOT NULL
    , fld_department VARCHAR(15) NOT NULL
    , PRIMARY KEY (fld_eid)
);

INSERT INTO tbl_employee_list_2 (
    fld_efirst_name
    ,fld_emid_name
    ,fld_elast_name
    ,fld_eage
    ,fld_ejob_title
    ,fld_erate
    ,fld_department )
VALUES 
    ('Pedro', 'Tanghalan', 'Maliwanag', 21, 'Electrician', 480.75, 'Maintenance')
    ,('Inday', 'Sagalpot', 'Magdalena', 20, 'Office Staff', 520, 'Orders')
    ,('Minda', 'Bebang', 'Stallone', 29, 'Order Manager', 610, 'Orders')
    ,('Andres', 'Bonifacio', 'Aquino', 27, 'Messenger', 520, 'Orders')
    ,('Myrna', 'Marquez', 'Tejeros', 26, 'Plumber', 504, 'Maintenance');

UPDATE tbl_employee_list_2
SET
    fld_eage = 21
WHERE
    fld_eid = 2;

DELETE FROM tbl_employee_list_2;

INSERT INTO tbl_employee_list_2 (fld_eid, fld_efirst_name ,fld_emid_name ,fld_elast_name ,fld_eage ,fld_ejob_title ,fld_erate ,fld_department )
VALUES 
    (20, 'Martin', 'Macalintal', 'Dela Cruz', 22, 'Janitor', 480.75, 'Maintenance');

INSERT INTO tbl_employee_list_2 (fld_efirst_name ,fld_emid_name ,fld_elast_name ,fld_eage ,fld_ejob_title ,fld_erate ,fld_department )
VALUES 
    ('Jonathan', 'Serfa', 'Coquilla', 28, 'Office Staff', 530, 'Orders');


ex
given 
table name
fields
datatype

gawa ka ng create query

3 rows ng info
gawa ka ng insert query para sa tatlong

gawa ka ng select query para makita lahat