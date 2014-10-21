package istic.miage.IDM.jooq.jooqTest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 * Test de Jooq
 * @author Geoffrey Alexandre
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection co = null;
       //@TODO : change here
       String user = "root";
       //@TODO : change here
       String pwd ="root";
       //@TODO : change the port 
       String url ="jdbc:mysql://localhost:8889/BASE_IDM";
       
       try{
    	   Class.forName("com.mysql.jdbc.Driver").newInstance();
    	   co = DriverManager.getConnection(url, user, pwd);
    	   System.out.println("co: " +co.getCatalog());
       } catch(Exception e){
    	   e.printStackTrace();
       }
       System.out.println("BDD : OK");
       DSLContext create = DSL.using(co,SQLDialect.MYSQL);
       
       
       /*
        * select * from Etudiant
        */
       Result<Record> result = create.select().from("Etudiant").fetch();
       System.out.println("Résultat de la première requête: \n"+result);
       
       
       /*
        * select NOM_FORMA FROM Formation, Universite Where Formation.ID_UNI=Universite.ID_UNIV
        * AND Universite.NOM_UNIV='Université de Rennes  
        */
       Result<Record1<Object>> res = create.select(DSL.fieldByName("NOM_FORMA")).from("Formation, Universite")
    		   .where("Formation.ID_UNI=Universite.ID_UNIV")
    		   .and("Universite.NOM_UNIV='Université de Rennes'")
    		   .fetch();
       System.out.println("Résultat de la seconde requête : \n"+res);
       
       /*
        * select PRENOM_ETU, NOM_ETU,NOM_FORMA,NOM_UNIV
        * from Etudiant, Universite, Formation
        * where Formation.ID_UNI=Universite.ID_UNIV
        * and Universite.NOM_UNIV='Université de Rennes'
        * and Etudiant.ID_FORMA=Formation.ID_FORMATION
        */
       System.out.println("Résultat de la troisieme requête:");
       Result<Record4<Object, Object, Object, Object>>res2 = create.select(DSL.fieldByName("PRENOM_ETU"), DSL.fieldByName("NOM_ETU"), DSL.fieldByName("NOM_FORMA"), DSL.fieldByName("NOM_UNIV"))
    		   .from("Etudiant, Universite,Formation")
    		   .where("Formation.ID_UNI=Universite.ID_UNIV")
    		   .and("Universite.NOM_UNIV='Université de Rennes'")
    		   .and("Etudiant.ID_FORMA=Formation.ID_FORMATION")
    		   .fetch();
       System.out.println(res2);
       
    }
}
