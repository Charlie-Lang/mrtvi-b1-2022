INSERT INTO tbl_department(fld_department, fld_dhead, fld_doffice, fld_dcontact) VALUES ('IT','Alma Adriel','205','09553174322');

SELECT * 
FROM tbl_employee_list_2
JOIN tbl_department
ON tbl_employee_list_2.fld_department =  tbl_department.fld_department;


SELECT 
FROM tbl_employee_list_2
JOIN tbl_department
ON tbl_employee_list_2.fld_department =  tbl_department.fld_department

SELECT 
	tbl_employee_list_2.fld_efirst_name
    ,tbl_employee_list_2.fld_emid_name
    ,tbl_employee_list_2.fld_elast_name
    ,tbl_employee_list_2.fld_eage
    ,tbl_employee_list_2.fld_ejob_title
    ,tbl_department.fld_doffice
    ,tbl_department.fld_dcontact
FROM tbl_employee_list_2
LEFT JOIN tbl_department
ON tbl_employee_list_2.fld_department =  tbl_department.fld_department


-- Using AS keyword
SELECT 
	t1.fld_efirst_name
    ,t1.fld_emid_name
    ,t1.fld_elast_name
    ,t1.fld_eage
    ,t1.fld_ejob_title
    ,t2.fld_doffice
    ,t2.fld_dcontact
FROM tbl_employee_list_2 AS t1
LEFT JOIN tbl_department AS t2
ON t1.fld_department =  t2.fld_department

-- kaya ginagamitan ng AS keyword para pag tatawagin yung mga column pwedeng
-- yung binigay natin na pangalan na lang ang gagamitin

