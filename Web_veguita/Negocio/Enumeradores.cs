using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Enumeradores
    {
        public enum Regiones
        {
            Metropolitana, Tarapaca, Antofagasta, Atacama, Coquimbo,
            Valparaiso, OHiggins, Maule, BioBio, Araucania, LosLagos,
            Aysen, MagallanesAntartica, LosRios, AricaParinacota
        }

        public enum ComunasMetropolitana
        {
            Santiago,
            Cerrillos,
            CerroNavia,
            Conchalí,
            ElBosque,
            EstaciónCentral,
            Huechuraba,
            Independencia,
            LaCisterna,
            LaFlorida,
            LaPintana,
            LaGranja,
            LaReina,
            LasCondes,
            LoBarnechea,
            LoEspejo,
            LoPrado,
            Macul,
            Maipú,
            Ñuñoa,
            PedroAguirreCerda,
            Peñalolén,
            Providencia,
            Pudahuel,
            Quilicura,
            QuintaNormal,
            Recoleta,
            Renca,
            SanJoaquín,
            SanMiguel,
            SanRamón,
            Vitacura,
            PuenteAlto,
            Pirque,
            SanJoséDeMaipo,
            Colina,
            Lampa,
            Tiltil,
            SanBernardo,
            Buin,
            CaleraDeTango,
            Paine,
            Melipilla,
            Alhué,
            Curacaví,
            MaríaPinto,
            SanPedro,
            Talagante,
            ElMonte,
            IslaDeMaipo,
            PadreHurtado,
            Peñaflor
        }

        public enum ComunasTarapaca
        {
            Iquique,
            AltoHospicio,
            PozoAlmonte,
            Camiña,
            Colchane,
            Huara,
            Pica
        }

        public enum ComunasAntofagasta
        {
            Antofagasta,
            Mejillones,
            SierraGorda,
            Taltal,
            Calama,
            Ollagüe,
            SanPedroDeAtacama,
            Tocopilla,
            MaríaElena,
        }

        public enum ComunasAtacama
        {
            Copiapó,
            Caldera,
            TierraAmarilla,
            Chañaral,
            DiegoDeAlmagro,
            Vallenar,
            AltoDelCarmen,
            Freirina,
            Huasco
        }

        public enum ComunasCoquimbo
        {
            LaSerena,
            Coquimbo,
            Andacollo,
            LaHiguera,
            Paiguano,
            Vicuña,
            Illapel,
            Canela,
            LosVilos,
            Salamanca,
            Ovalle,
            Combarbalá,
            MontePatria,
            Punitaqui,
            RíoHurtado
        }

        public enum ComunasValparaiso
        {
            Valparaíso,
            Casablanca,
            Concón,
            JuanFernández,
            Puchuncaví,
            Quilpué,
            Quintero,
            VillaAlemana,
            ViñaDelMar,
            IslaDePascua,
            LosAndes,
            CalleLarga,
            Rinconada,
            SanEsteban,
            LaLigua,
            Cabildo,
            Papudo,
            Petorca,
            Zapallar,
            Quillota,
            Calera,
            Hijuelas,
            LaCruz,
            Limache,
            Nogales,
            Olmué,
            SanAntonio,
            Algarrobo,
            Cartagena,
            ElQuisco,
            ElTabo,
            SantoDomingo,
            SanFelipe,
            Catemu,
            Llaillay,
            Panquehue,
            Putaendo,
            SantaMaría,
        }

        public enum ComunasOhiggins
        {
            Rancagua,
            Codegua,
            Coinco,
            Coltauco,
            Doñihue,
            Graneros,
            LasCabras,
            Machalí,
            Malloa,
            Mostazal,
            Olivar,
            Peumo,
            Pichidegua,
            QuintaDeTilcoco,
            Rengo,
            Requínoa,
            SanVicente,
            Pichilemu,
            LaEstrella,
            Litueche,
            Marchihue,
            Navidad,
            Paredones,
            SanFernando,
            Chépica,
            Chimbarongo,
            Lolol,
            Nancagua,
            Palmilla,
            Peralillo,
            Placilla,
            Pumanque,
            SantaCruz
        }

        public enum ComunasMaule
        {
            Talca,
            Constitución,
            Curepto,
            Empedrado,
            Maule,
            Pelarco,
            Pencahue,
            RíoClaro,
            SanClemente,
            SanRafael,
            Cauquenes,
            Chanco,
            Pelluhue,
            Curicó,
            Hualañé,
            Licantén,
            Molina,
            Rauco,
            Romeral,
            SagradaFamilia,
            Teno,
            Vichuquén,
            Linares,
            Colbún,
            Longaví,
            Parral,
            Retiro,
            SanJavier,
            VillaAlegre,
            YerbasBuenas
        }

        public enum ComunasBioBio
        {
            Concepción,
            Coronel,
            Chiguayante,
            Florida,
            Hualqui,
            Lota,
            Penco,
            SanPedroDeLaPaz,
            SantaJuana,
            Talcahuano,
            Tomé,
            Hualpén,
            Lebu,
            Arauco,
            Cañete,
            Contulmo,
            Curanilahue,
            LosÁlamos,
            Tirúa,
            LosÁngeles,
            Antuco,
            Cabrero,
            Laja,
            Mulchén,
            Nacimiento,
            Negrete,
            Quilaco,
            Quilleco,
            SanRosendo,
            SantaBárbara,
            Tucapel,
            Yumbel,
            AltoBíoBío,
            Chillán,
            Bulnes,
            Cobquecura,
            Coelemu,
            Coihueco,
            ChillánViejo,
            ElCarmen,
            Ninhue,
            Ñiquén,
            Pemuco,
            Pinto,
            Portezuelo,
            Quillón,
            Quirihue,
            Ránquil,
            SanCarlos,
            SanFabián,
            SanIgnacio,
            SanNicolás,
            Treguaco,
            Yungay

        }

        public enum ComunasAraucania
        {
            Temuco,
            Carahue,
            Cunco,
            Curarrehue,
            Freire,
            Galvarino,
            Gorbea,
            Lautaro,
            Loncoche,
            Melipeuco,
            NuevaImperial,
            PadreLasCasas,
            Perquenco,
            Pitrufquén,
            Pucón,
            Saavedra,
            TeodoroSchmidt,
            Toltén,
            Vilcún,
            Villarrica,
            Cholchol,
            Angol,
            Collipulli,
            Curacautín,
            Ercilla,
            Lonquimay,
            LosSauces,
            Lumaco,
            Purén,
            Renaico,
            Traiguén,
            Victoria
        }

        public enum ComunasLosLagos
        {
            PuertoMontt,
            Calbuco,
            Cochamó,
            Fresia,
            Frutillar,
            LosMuermos,
            Llanquihue,
            Maullín,
            PuertoVaras,
            Castro,
            Ancud,
            Chonchi,
            CuracoDeVélez,
            Dalcahue,
            Puqueldón,
            Queilén,
            Quellón,
            Quemchi,
            Quinchao,
            Osorno,
            PuertoOctay,
            Purranque,
            Puyehue,
            RíoNegro,
            SanJuanDeLaCosta,
            SanPablo,
            Chaitén,
            Futaleufú,
            Hualaihué,
            Palena

        }

        public enum ComunasAysen
        {
            Coihaique,
            LagoVerde,
            Aysen,
            Cisnes,
            Guaitecas,
            Cochrane,
            OHiggins,
            Tortel,
            ChileChico,
            RíoIbáñez,
        }

        public enum ComunasMagallanes
        {
            PuntaArenas,
            LagunaBlanca,
            RíoVerde,
            SanGregorio,
            CaboDeHornos,
            Antártica,
            Porvenir,
            Primavera,
            Timaukel,
            Natales,
            TorresDelPaine
        }

        public enum ComunasLosRios
        {
            Valdivia,
            Corral,
            Lanco,
            LosLagos,
            Máfil,
            Mariquina,
            Paillaco,
            Panguipulli,
            LaUnión,
            Futrono,
            LagoRanco,
            RíoBueno
        }

        public enum ComunasArica
        {
            Arica,
            Camarones,
            Putre,
            GeneralLagos
        }
    }
}
