UPDATE tbl_pricelist
SET
	fld_plname = 'Oishi Prawn Crackers Spicy Flavor 90g x 3'
    , fld_plprice = 66
WHERE
	fld_plid = 7;

UPDATE tbl_pricelist
SET
	fld_plname = 'Presto Creams Peanut Butter (30g x 10)'
    , fld_plprice = 56.15
WHERE
	fld_plid = 8;

DELETE FROM tbl_employee_list_2
WHERE fld_eid = 20;


-- SCENARIO: Paano makikita lahat ng mga nasa employee list 2 na me sahod from 500 to 800
SELECT * FROM tbl_employee_list_2
WHERE
	fld_erate >= 500
	AND
	fld_erate <= 800;

-- BETWEEN alternative
SELECT * FROM tbl_employee_list_2
WHERE
	fld_erate
BETWEEN
	500 AND 800;


-- SCENARIO: Gusto ko makita lahat ng nasa Orders ar Maintenance department
SELECT * FROM tbl_employee_list_2
WHERE
	fld_department='Orders'
	OR
	fld_department='Maintenance';

-- IN alternative
SELECT * FROM tbl_employee_list_2
WHERE
	fld_department
IN
	('Orders'
	,'Maintenance');
	

UPDATE tbl_employee_list_2 "
                + "SET fld_efirst_name = ?"
                + ",fld_emid_name = ?"
                + ",fld_elast_name = ?"
                + ",fld_eage = ?"
                + ",fld_ejob_title = ?"
                + ",fld_erate = ?"
                + ",fld_department = ?"
                + "WHERE fld_eid = ?";