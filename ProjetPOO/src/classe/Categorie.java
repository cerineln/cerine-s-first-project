/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Lenovo
 */
public class Categorie {
    private AtomicInteger code;
    private String nom;
}
//CREATE TABLE categorie(cat_code serial not null primary key,nom varchar(25));
//CREATE TABLE produit(code serial not null primary key, nom varchar(25), qte integer, cat integer, desc varchar(45),constraint fk_key foreignkey(cat) references categorie(cat_id));

//CREATE TABLE produit(code serial not null primary key, nom varchar(25), qte integer, cat varchar(255), desc varchar(45));

//select * from produit where nom='';
//select * from produit where cat='';

// insert into produit values('abc',32,'cat2','esfsdf');

//delete from produit where nom='' returning null;

//alter table produit set qte=34 where nom='';