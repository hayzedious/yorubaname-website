package org.oruko.dictionary.util;

import org.oruko.dictionary.model.GeoLocation;
import org.oruko.dictionary.model.NameEntry;
import org.oruko.dictionary.model.State;
import org.oruko.dictionary.model.repository.Etymology;
import org.oruko.dictionary.model.repository.GeoLocationRepository;
import org.oruko.dictionary.model.repository.NameEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;

/**
 * Created by Dadepo Aderemi.
 */
@Component
public class DatabaseImporter {

    @Value("${app.host}")
    private String host;

    @Autowired
    private GeoLocationRepository geoLocationRepository;

    @Autowired
    private NameEntryRepository nameEntryRepository;


    @PostConstruct
    public void initializeDb() {

        if (geoLocationRepository.findAll().size() == 0) {
            initGeoLocation();
        }
        /**
         * Only initialize the database only when in dev
         */
        if (host.equalsIgnoreCase("localhost")) {

            Etymology dummyEtymology1 = new Etymology();
            dummyEtymology1.setPart("first section");
            dummyEtymology1.setMeaning("first section meaning");

            Etymology dummyEtymology2 = new Etymology();
            dummyEtymology2.setPart("second section");
            dummyEtymology2.setMeaning("second section meaning");

            ArrayList<Etymology> etymology = new ArrayList<>();
            etymology.add(dummyEtymology1);
            etymology.add(dummyEtymology2);

            // sample name entries
            NameEntry lagbaja = new NameEntry("lagbaja");
            lagbaja.setMeaning("This is dummy meaning for Lagbaja");
            lagbaja.setExtendedMeaning("This is extended dummy meaning for Lagbaja");
            lagbaja.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY"),
                                                 new GeoLocation("I DO NOT KNOW", "UNDEFINED")));
            lagbaja.setEtymology(etymology);
            lagbaja.setState(State.NEW);


            NameEntry tamedo = new NameEntry("tamedo");
            tamedo.setMeaning("This is dummy meaning for tamedo");
            tamedo.setExtendedMeaning("This is extended dummy meaning for tamedo");
            tamedo.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            tamedo.setEtymology(etymology);
            tamedo.setState(State.NEW);

            NameEntry koko = new NameEntry("koko");
            koko.setMeaning("This is dummy meaning for koko");
            koko.setExtendedMeaning("This is extended dummy meaning for koko");
            koko.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            koko.setEtymology(etymology);
            koko.setState(State.MODIFIED);


            NameEntry tola = new NameEntry("tola");
            tola.setMeaning("This is dummy meaning for tola");
            tola.setExtendedMeaning("This is extended dummy meaning for tola");
            tola.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            tola.setEtymology(etymology);
            tola.setState(State.MODIFIED);


            NameEntry dadepo = new NameEntry("dadepo");
            dadepo.setMeaning("This is dummy meaning for dadepo");
            dadepo.setExtendedMeaning("This is extended dummy meaning for dadepo");
            dadepo.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            dadepo.setEtymology(etymology);
            dadepo.setState(State.MODIFIED);

            NameEntry bolanle = new NameEntry("Bọ́lánlé");
            bolanle.setMeaning("This is dummy meaning for Bọ́lánlé");
            bolanle.setExtendedMeaning("This is extended dummy meaning for Bọ́lánlé");
            bolanle.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            bolanle.setEtymology(etymology);
            bolanle.setState(State.NEW);

            NameEntry ade0 = new NameEntry("Ade");
            ade0.setMeaning("This is dummy meaning for ade");
            ade0.setExtendedMeaning("This is extended dummy meaning for ade");
            ade0.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            ade0.setEtymology(etymology);
            ade0.setState(State.NEW);

            NameEntry ade1 = new NameEntry("Adewale");
            ade1.setMeaning("This is dummy meaning for adewale");
            ade1.setExtendedMeaning("This is extended dummy meaning for adewale");
            ade1.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            ade1.setEtymology(etymology);
            ade1.setState(State.NEW);

            NameEntry ade2 = new NameEntry("Adekunle");
            ade2.setMeaning("This is dummy meaning for Adekunle");
            ade2.setExtendedMeaning("This is extended dummy meaning for Adekunle");
            ade2.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            ade2.setEtymology(etymology);
            ade2.setState(State.NEW);

            NameEntry ade3 = new NameEntry("Adetunji");
            ade3.setMeaning("This is dummy meaning for Adetunji");
            ade3.setExtendedMeaning("This is extended dummy meaning for Adetunji");
            ade3.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            ade3.setEtymology(etymology);
            ade3.setState(State.NEW);

            NameEntry ade4 = new NameEntry("Adedotun");
            ade4.setMeaning("This is dummy meaning for Adedotun");
            ade4.setExtendedMeaning("This is extended dummy meaning for Adedotun");
            ade4.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            ade4.setEtymology(etymology);
            ade4.setState(State.NEW);

            /**
             * Sample for search beahviour with variants and otherlanguages
             */
            NameEntry omowumi = new NameEntry("Omowumi");
            omowumi.setVariants("omawunmi, omawumi");
            omowumi.setInOtherLanguages("omewami");
            omowumi.setMeaning("This is dummy meaning for Omowumi");
            omowumi.setExtendedMeaning("This is extended dummy meaning for Omowumi");
            omowumi.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            omowumi.setEtymology(etymology);
            omowumi.setState(State.NEW);


            NameEntry omolabi = new NameEntry("Omolabi");
            omolabi.setMeaning("This is dummy meaning for omolabi");
            omolabi.setExtendedMeaning("This is extended dummy meaning for omolabi");
            omolabi.setGeoLocation(Arrays.asList(new GeoLocation("IBADAN", "NWY")));
            omolabi.setEtymology(etymology);
            omolabi.setState(State.NEW);

            nameEntryRepository.save(lagbaja);
            nameEntryRepository.save(tamedo);
            nameEntryRepository.save(koko);
            nameEntryRepository.save(tola);
            nameEntryRepository.save(tola);
            nameEntryRepository.save(dadepo);
            nameEntryRepository.save(bolanle);
            nameEntryRepository.save(ade0);
            nameEntryRepository.save(ade1);
            nameEntryRepository.save(ade2);
            nameEntryRepository.save(ade3);
            nameEntryRepository.save(ade4);
            nameEntryRepository.save(omowumi);
            nameEntryRepository.save(omolabi);
        }
    }

    private void initGeoLocation() {
        // North-West Yoruba (NWY): Abẹokuta, Ibadan, Ọyọ, Ogun and Lagos (Eko) areas
        // Central Yoruba (CY): Igbomina, Yagba, Ilésà, Ifẹ, Ekiti, Akurẹ, Ẹfọn, and Ijẹbu areas.
        // South-East Yoruba (SEY): Okitipupa, Ilaje, Ondo, Ọwọ, Ikarẹ, Ṣagamu, and parts of Ijẹbu.

        geoLocationRepository.save(new GeoLocation("ABEOKUTA", "NWY"));
        geoLocationRepository.save(new GeoLocation("IBADAN", "NWY"));
        geoLocationRepository.save(new GeoLocation("OYO", "OYO"));
        geoLocationRepository.save(new GeoLocation("OGUN", "OGN"));
        geoLocationRepository.save(new GeoLocation("EKO", "EKO"));

        geoLocationRepository.save(new GeoLocation("IGBOMINA", "CY"));
        geoLocationRepository.save(new GeoLocation("YAGBA", "CY"));
        geoLocationRepository.save(new GeoLocation("ILESHA", "CY"));
        geoLocationRepository.save(new GeoLocation("IFE", "CY"));
        geoLocationRepository.save(new GeoLocation("EKITI", "CY"));
        geoLocationRepository.save(new GeoLocation("AKURE", "CY"));
        geoLocationRepository.save(new GeoLocation("EFON", "CY"));
        geoLocationRepository.save(new GeoLocation("IJEBU", "CY"));

        geoLocationRepository.save(new GeoLocation("OKITIPUPA", "SEY"));
        geoLocationRepository.save(new GeoLocation("IJALE", "SEY"));
        geoLocationRepository.save(new GeoLocation("ONDO", "SEY"));
        geoLocationRepository.save(new GeoLocation("OWO", "SEY"));
        geoLocationRepository.save(new GeoLocation("IKARE", "SEY"));
        geoLocationRepository.save(new GeoLocation("SAGAMU", "SEY"));
        geoLocationRepository.save(new GeoLocation("GENERAL/NOT LOCATION SPECIFIC", "GENERAL"));
        geoLocationRepository.save(new GeoLocation("I DO NOT KNOW", "UNDEFINED"));

        geoLocationRepository.save(new GeoLocation("FOREIGN: ARABIC", "FOREIGN_ARABIC"));
        geoLocationRepository.save(new GeoLocation("FOREIGN: GENERAL", "FOREIGN_GENERAL"));
    }
}
