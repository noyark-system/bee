/*Culesberry technolegy Co. Ltd. (c) 2019-2020
 *
 * Stating that the software,the software belongs Gulesberry
 * noyark open source group,noyark has all the power to interpret
 * and copyright information for the software prohibit organizations
 * and individuals conduct their business practices and illegal practices,
 * projects of: magiclu,Kevin J.,James,Jack,Lou,Chinese name *Changcun Lu*,*Kaiwen Jia*
 * ,*heRui*,*Xiangjie Li*,*Fuxin Huang*.The software has nothing to do with current politics,
 * free software is the purpose of noyark
 *
 * noyark-system info:
 * 	****************************************************
 * 											web.noyark.net
 * 					 www.github.com/noyark-system/boot_web
 *		 ****************************************************
 * This project is based on the springboot project,developed
 * by the noyark-system team.and the project is a server-side
 * java project
 *
 * @AUTHOR James
 * @AUTHOR Kevin J.
 * @AUTHOR Jack
 * @AUTHOR magiclu
 * @AUTHOR lou
 *
 * @SEE SPRINGBOOT
 * @SEE MYBATIS
 *
 * @VERSION 0.0.1
 */

package net.noyark.www.web.gulesberry.springboot.outcode.forum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/** This class build in spring boot */
@MapperScan("net.noyark.www.web.gulesberry.springboot.outcode.forum.mapper")
@SpringBootApplication
@Configuration
public class BeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeeApplication.class, args);
    }

}
