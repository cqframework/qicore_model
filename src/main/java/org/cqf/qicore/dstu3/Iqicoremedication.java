package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Medication;

import java.util.List;

import org.hl7.fhir.dstu3.model.UriType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

import org.hl7.fhir.dstu3.model.IdType;

public interface Iqicoremedication
{

   public Medication getAdaptee();

   public void setAdaptee(Medication param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedication setImplicitRulesElement(UriType param);

   public Iqicoremedication setImplicitRules(String param);

   public List<Resource> getContained();

   public Iqicoremedication setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedication addContained(Resource param);

   public Medication.MedicationPackageComponent getPackage();

   public qicoremedicationAdapter setPackage(
         Medication.MedicationPackageComponent param);

   public boolean hasPackage();

   public CodeableConcept getCode();

   public Iqicoremedication setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasManufacturer();

   public Reference getManufacturer();

   public Iqicoremedication setManufacturer(Reference param);

   public Organization getManufacturerTarget();

   public Iqicoremedication setManufacturerTarget(Organization param);

   public qicoreorganizationAdapter getManufacturerAdapterTarget();

   public Iqicoremedication setManufacturerAdapterTarget(
         qicoreorganizationAdapter param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedication setLanguageElement(CodeType param);

   public Iqicoremedication setLanguage(String param);

   public boolean hasIsBrand();

   public boolean hasIsBrandElement();

   public BooleanType getIsBrandElement();

   public Boolean getIsBrand();

   public Iqicoremedication setIsBrandElement(BooleanType param);

   public Iqicoremedication setIsBrand(Boolean param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedication setIdElement(IdType param);

   public Iqicoremedication setId(String param);
}
