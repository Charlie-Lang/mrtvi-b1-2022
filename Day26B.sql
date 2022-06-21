CREATE TABLE tbl_words(
fld_word VARCHAR(20)
);

INSERT INTO tbl_words
VALUES
('Alphabet')
,('Apple')
,('aso')
,('alapaap')
,('alamang')
,('Alpombra')
,('Banana')
,('bacon');


SELECT * FROM tbl_words;

SELECT * FROM tbl_words WHERE fld_word BETWEEN 'A' AND 'B';

SELECT * FROM `tbl_employee_list_2`
ORDER BY fld_elast_name DESC;

SELECT * FROM `tbl_employee_list_2` WHERE 1
ORDER BY fld_department;

SELECT * FROM `tbl_employee_list_2` WHERE 1
ORDER BY fld_department, fld_elast_name;


SELECT * FROM tbl_employee_list_2
LIMIT 0,3;

SELECT * FROM tbl_employee_list_2
LIMIT 3,3;

-- get all lastname with an A i it
SELECT * FROM tbl_employee_list_2 WHERE UPPER(fld_elast_name) LIKE '%A%'

SELECT SUM(fld_erate) FROM tbl_employee_list_2;

SELECT SUM(fld_erate) FROM tbl_employee_list_2 WHERE fld_department = 'Orders';

SELECT AVG(fld_erate) FROM tbl_employee_list_2;


SELECT COUNT(*) FROM tbl_employee_list_2 WHERE fld_department='Repairs';
SELECT COUNT(*), AVG(fld_erate) FROM tbl_employee_list_2 WHERE fld_department='Maintenance';
SELECT COUNT(*) FROM tbl_employee_list_2 WHERE fld_department='Floor';
SELECT COUNT(*) FROM tbl_employee_list_2 WHERE fld_department='Orders';

SELECT 
	fld_ejob_title
	, COUNT(*)
	, AVG(fld_erate) 
FROM tbl_employee_list_2 
GROUP BY fld_ejob_title
ORDER BY fld_ejob_title

CREATE TABLE tbl_department (
	fld_department VARCHAR(15) NOT NULL
	, fld_dhead VARCHAR(45) NOT NULL
	, fld_doffice VARCHAR(5) NOT NULL
	, fld_dcontact VARCHAR(27)
)


INSERT INTO `tbl_department`(`fld_department`, `fld_dhead`, `fld_doffice`, `fld_dcontact`) 
VALUES 	
('Floor','Gerald Dimahagilap','404','09127001308')
,('Maintenance','Aldrin Masinop','102','09554443366')
,('Orders','Mara Mae','202','09555551234')
,('Repairs','Ping ping Rosales','107','091234567');

INSERT INTO tbl_employee_list_2 (fld_efirst_name, fld_emid_name, fld_elast_name, fld_eage, fld_ejob_title, fld_erate, fld_department) VALUES ('Jose', 'Francisco', 'Joseph', '28', 'Marketing', '444', 'Marketing')

SELECT * 
FROM tbl_employee_list_2 AS t1
JOIN tbl_department AS t2
WHERE t1.fld_department = t2.fld_department
