/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2017-12-21 13:59:30                          */
/*==============================================================*/


alter table "DowodRejestracyjny"
   drop constraint FK_DOWODREJ_FK_DOWODR_POJAZD;

alter table "WlascicielSamochodu"
   drop constraint FK_WLASCICI_FK_WLASCI_DOWODREJ;

alter table "WlascicielSamochodu"
   drop constraint FK_WLASCICI_FK_WLASCI_WLASCICI;

drop table "DowodRejestracyjny" cascade constraints;

drop table "Pojazd" cascade constraints;

drop table "User" cascade constraints;

drop table "Wlasciciel" cascade constraints;

drop table "WlascicielSamochodu" cascade constraints;

/*==============================================================*/
/* Table: "DowodRejestracyjny"                                  */
/*==============================================================*/
create table "DowodRejestracyjny" 
(
   "NrRejestracyjny"    CHAR(9)              not null,
   VIN                  CHAR(17),
   "Seria"              CHAR(6)              not null,
   "Numer"              CHAR(7)              not null,
   "OrganWydajacy"      CLOB                 not null,
   "DataRej"            DATE                 not null,
   "KrajRej"            CHAR(30)             not null,
   "DataPierRej"        DATE                 not null,
   "OkresWaznosci"      DATE                 not null,
   "DataBadania"        DATE,
   "DataNastBadania"    DATE,
   constraint PK_DOWODREJESTRACYJNY primary key ("NrRejestracyjny")
);

/*==============================================================*/
/* Table: "Pojazd"                                              */
/*==============================================================*/
create table "Pojazd" 
(
   VIN                  CHAR(17)             not null,
   "Marka"              CHAR(30)             not null,
   "Model"              CHAR(30)             not null,
   "Generacja"          CHAR(3),
   "TypNadwozia"        CHAR(20)             not null,
   "IloscMiejsc"        SMALLINT             not null,
   "PojemnoscSilnika"   INTEGER              not null,
   "Moc"                INTEGER              not null,
   "SeriaKartyPojazdu"  CHAR(6),
   "NrKartyPojazdu"     CHAR(7),
   "MaxMasaCalkowita"   INTEGER,
   "MasaWlasna"         INTEGER,
   "LiczbaOsi"          SMALLINT,
   constraint PK_POJAZD primary key (VIN)
);

/*==============================================================*/
/* Table: "User"                                                */
/*==============================================================*/
create table "User" 
(
   "UserID"             CHAR(20)             not null,
   "Password"           CHAR(20)             not null,
   "Create"             SMALLINT             not null,
   "Read"               SMALLINT             not null,
   "Update"             SMALLINT             not null,
   "Delete"             SMALLINT             not null,
   constraint PK_USER primary key ("UserID")
);

/*==============================================================*/
/* Table: "Wlasciciel"                                          */
/*==============================================================*/
create table "Wlasciciel" 
(
   PESEL                CHAR(11)             not null,
   "Imie"               CHAR(20)             not null,
   "Nazwisko"           CHAR(30)             not null,
   "DataUrodzenia"      DATE,
   "Miejscowosc"        CHAR(30)             not null,
   "Ulica"              CHAR(50)             not null,
   "NrBudynku"          CHAR(10)             not null,
   "NrLokalu"           CHAR(10),
   REGON                CHAR(9)              not null,
   constraint PK_WLASCICIEL primary key (PESEL)
);

/*==============================================================*/
/* Table: "WlascicielSamochodu"                                 */
/*==============================================================*/
create table "WlascicielSamochodu" 
(
   PESEL                CHAR(11)             not null,
   "NrRejestracyjny"    CHAR(9)              not null,
   constraint PK_WLASCICIELSAMOCHODU primary key (PESEL, "NrRejestracyjny")
);

alter table "DowodRejestracyjny"
   add constraint FK_DOWODREJ_FK_DOWODR_POJAZD foreign key (VIN)
      references "Pojazd" (VIN);

alter table "WlascicielSamochodu"
   add constraint FK_WLASCICI_FK_WLASCI_DOWODREJ foreign key ("NrRejestracyjny")
      references "DowodRejestracyjny" ("NrRejestracyjny");

alter table "WlascicielSamochodu"
   add constraint FK_WLASCICI_FK_WLASCI_WLASCICI foreign key (PESEL)
      references "Wlasciciel" (PESEL);

