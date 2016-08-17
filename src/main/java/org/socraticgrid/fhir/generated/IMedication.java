package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IMedication
{

   public Medication getAdaptee();

   public void setAdaptee(Medication param);

   public Medication.Product getProduct();

   public IMedication setProduct(Medication.Product param);

   public ContainedDt getContained();

   public IMedication setContained(ContainedDt param);

   public NarrativeDt getText();

   public IMedication setText(NarrativeDt param);

   public Medication.Package getPackage();

   public IMedication setPackage(Medication.Package param);

   public CodeableConceptDt getCode();

   public IMedication setCode(CodeableConceptDt param);

   public Organization getManufacturerResource();

   public IMedication setManufacturerResource(Organization param);

   public CodeDt getLanguage();

   public IMedication setLanguage(CodeDt param);

   public BooleanDt getIsBrandElement();

   public Boolean getIsBrand();

   public IMedication setIsBrand(Boolean param);

   public IMedication setIsBrand(BooleanDt param);

   public IdDt getId();

   public IMedication setId(IdDt param);
}