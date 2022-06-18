CREATE TABLE tbl_pricelist (
    fld_plid INT NOT NULL AUTO_INCREMENT
    , fld_plname VARCHAR(45)
    , fld_plcategory VARCHAR(20)
    , fld_plprice DECIMAL(16,4)
    , PRIMARY KEY (fld_plid)
);
-- BAKIT WAG KA GAGAMIT NG SPACE SA db, tbl or fld NAME MO?
-- SAKIT YAN SA ULO
-- PAG NA DEBUG KA NA TAPOS DI MO NAPANSIN DALWANG SPACE PALA YUN

INSERT INTO tbl_pricelist
    (fld_plname
    ,fld_plcategory
    ,fld_plprice)
VALUES
    ('Cookies n Cream','Biscuits',55)
    ,('Ultra Fire 18650','Electronics',60)
    ,('Seagate External HDD','Electronics',3000)
    ,('Safeguard White','Hygiene',135)
    ,('Safeguard Yellow','Hygiene',43);

SELECT * FROM tbl_pricelist;

INSERT INTO tbl_pricelist (fld_plname ,fld_plcategory ,fld_plprice) VALUES ('Nova Cheese', 'Snacks', 28.50);

INSERT INTO tbl_pricelist (fld_plname,fld_plcategory,fld_plprice) VALUES ('Oishi', 'Snacks', 15);
INSERT INTO tbl_pricelist (fld_plname,fld_plcategory,fld_plprice) VALUES ('Oishi Wafer', 'Biscuits', 40);
INSERT INTO tbl_pricelist (fld_plname,fld_plcategory,fld_plprice) VALUES ('Graham', 'Biscuits', 35);
INSERT INTO tbl_pricelist (fld_plname,fld_plcategory,fld_plprice) VALUES ('Rebisco', 'Biscuits', 35);


INSERT INTO tbl_employee_list_2 (fld_efirst_name, fld_emid_name, fld_elast_name
    ,fld_eage, fld_ejob_title, fld_erate, fld_department)
VALUES ('', '', '', '', '', '', '');