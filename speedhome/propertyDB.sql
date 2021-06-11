CREATE TABLE `property` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`property_name` VARCHAR(200) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`price` DOUBLE(22,0) NULL DEFAULT NULL,
	`type` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`furnish` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`title_type` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`rooms` INT(11) NULL DEFAULT NULL,
	`bathrooms` INT(11) NULL DEFAULT NULL,
	`car_parking` INT(11) NULL DEFAULT NULL,
	`extra_info` VARCHAR(200) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`offers` VARCHAR(200) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`id`) USING BTREE,
	UNIQUE INDEX `property_name` (`property_name`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2
;
