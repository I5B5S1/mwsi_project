package main.webapp.utils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jpa.entities.PojazdEntity;
import main.webapp.exception.ValidationException;

public class VehicleFormExtractor {
	public static PojazdEntity extractVehicle(HttpServletRequest request) throws ValidationException {
		Map<String, String> map = Nullifier.nullify(request.getParameterMap());
		String vin = map.get("vin");
		if (vin != null) {
			Validator.validateVin(vin);
		}

		String brand = map.get("brand");
		String model = map.get("model");
		String generation = map.get("generation");
		String bodyType = map.get("bodyType");
		Integer numberOfSeats = map.get("numberOfSeats") != null ? Integer.parseInt(map.get("numberOfSeats")) : null;
		Integer engineCapacity = map.get("EngineCapacity") != null ? Integer.parseInt(map.get("EngineCapacity")) : null;
		Integer power = map.get("power") != null ? Integer.parseInt(map.get("power")) : null;
		String vehicleCardSeries = map.get("vehicleCardSeries");
		String vehicleCardNumber = map.get("vehicleCardNumber");
		Integer maxTotalWeight = map.get("maxTotalWeight") != null ? Integer.parseInt(map.get("maxTotalWeight")) : null;
		Integer ownWeight = map.get("ownWeight") != null ? Integer.parseInt(map.get("ownWeight")) : null;
		Integer axesNumber = map.get("axesNumber") != null ? Integer.parseInt(map.get("axesNumber")) : null;
		
		Validator.validateBoolean(map.get("specialVehicle"));
		Boolean specialVehicle;
		if("tak".equals(map.get("specialVehicle"))){
			specialVehicle =  true;
		} else if("nie".equals(map.get("specialVehicle"))){
			specialVehicle = false;
		} else {
			specialVehicle = null;
		}
		String vehicleTheft = map.get("vehicleTheft");
		if (vehicleTheft != null) {
			Validator.validateDate(vehicleTheft);
		}
		String vehicleRetrieval = map.get("vehicleRetrieval");
		if (vehicleRetrieval != null) {
			Validator.validateDate(vehicleRetrieval);
		}
		String registrationPlateLoss = map.get("registrationPlateLoss");
		if (registrationPlateLoss != null) {
			Validator.validateDate(registrationPlateLoss);
		}
		String registrationPlateRetrieval = map.get("registrationPlateRetrieval");
		if (registrationPlateRetrieval != null) {
			Validator.validateDate(registrationPlateRetrieval);
		}
		String vehicleCardLoss = map.get("vehicleCardLoss");
		if (vehicleCardLoss != null) {
			Validator.validateDate(vehicleCardLoss);
		}
		String vehicleCardRetrieval = map.get("vehicleCardRetrieval");
		if (vehicleCardRetrieval != null) {
			Validator.validateDate(vehicleCardRetrieval);
		}
		
		PojazdEntity pojazdEntity = new PojazdEntity();
		pojazdEntity.setVin(vin);
		pojazdEntity.setMarka(brand);
		pojazdEntity.setModel(model);
		pojazdEntity.setGeneracja(generation);
		pojazdEntity.setTypNadwozia(bodyType);
		pojazdEntity.setIloscMiejsc(numberOfSeats);
		pojazdEntity.setPojemnoscSilnika(engineCapacity);
		pojazdEntity.setMoc(power);
		pojazdEntity.setSeriaKartyPojazdu(vehicleCardSeries);
		pojazdEntity.setNrkartypojazdu(vehicleCardNumber);
		pojazdEntity.setMaxMasaCalkowita(maxTotalWeight);
		pojazdEntity.setMasaWlasna(ownWeight);
		pojazdEntity.setLiczbaOsi(axesNumber);
		pojazdEntity.setPojazdSpecjalny(specialVehicle);
		pojazdEntity.setKradziezPojazdu(vehicleTheft);
		pojazdEntity.setOdnalezieniePojazdu(vehicleRetrieval);
		pojazdEntity.setUtrataTablicRejestracyjnych(registrationPlateLoss);
		pojazdEntity.setOdnalezienieTablicRejestracyjnych(registrationPlateRetrieval);
		pojazdEntity.setUtrataKartyPojazdu(vehicleCardLoss);
		pojazdEntity.setOdnalezienieaKartyPojazdu(vehicleCardRetrieval);
		return pojazdEntity;
	}
}
