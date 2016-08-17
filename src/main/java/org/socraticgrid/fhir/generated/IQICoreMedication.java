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

public interface IQICoreMedication
{

   public Medication getAdaptee();

   public void setAdaptee(Medication param);

   public Medication.Product getProduct();

   public IQICoreMedication setProduct(Medication.Product param);

   public ContainedDt getContained();

   public IQICoreMedication setContained(ContainedDt param);

   public NarrativeDt getText();

   public IQICoreMedication setText(NarrativeDt param);

   public Medication.Package getPackage();

   public IQICoreMedication setPackage(Medication.Package param);

   public CodeableConceptDt getCode();

   public IQICoreMedication setCode(CodeableConceptDt param);

   public QICoreOrganizationAdapter getManufacturerResource();

   public IQICoreMedication setManufacturerResource(
         QICoreOrganizationAdapter param);

   public CodeDt getLanguage();

   public IQICoreMedication setLanguage(CodeDt param);

   public BooleanDt getIsBrandElement();

   public Boolean getIsBrand();

   public IQICoreMedication setIsBrand(Boolean param);

   public IQICoreMedication setIsBrand(BooleanDt param);

   public IdDt getId();

   public IQICoreMedication setId(IdDt param);
}