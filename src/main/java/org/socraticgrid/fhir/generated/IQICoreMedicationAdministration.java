package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreMedicationAdministration
{

   public MedicationAdministration getAdaptee();

   public void setAdaptee(MedicationAdministration param);

   public CodeDt getLanguage();

   public IQICoreMedicationAdministration setLanguage(CodeDt param);

   public NarrativeDt getText();

   public IQICoreMedicationAdministration setText(NarrativeDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreMedicationAdministration setPatientResource(
         QICorePatientAdapter param);

   public MedicationAdministration.Dosage getDosage();

   public IQICoreMedicationAdministration setDosage(
         MedicationAdministration.Dosage param);

   public StringDt getNoteElement();

   public String getNote();

   public IQICoreMedicationAdministration setNote(String param);

   public IQICoreMedicationAdministration setNote(StringDt param);

   public BooleanDt getWasNotGivenElement();

   public Boolean getWasNotGiven();

   public IQICoreMedicationAdministration setWasNotGiven(Boolean param);

   public IQICoreMedicationAdministration setWasNotGiven(BooleanDt param);

   public DateTimeDt getEffectiveTimeDateTimeElement();

   public Date getEffectiveTimeDateTime();

   public IQICoreMedicationAdministration setEffectiveTimeDateTime(
         DateTimeDt param);

   public IQICoreMedicationAdministration setEffectiveTimeDateTime(Date param);

   public PeriodDt getEffectiveTimePeriod();

   public IQICoreMedicationAdministration setEffectiveTimePeriod(PeriodDt param);

   public BoundCodeableConceptDt getMedicationCodeableConcept();

   public IQICoreMedicationAdministration setMedicationCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IQICoreMedicationAdministration setMedicationReference(
         ResourceReferenceDt param);

   public IdDt getId();

   public IQICoreMedicationAdministration setId(IdDt param);

   public ContainedDt getContained();

   public IQICoreMedicationAdministration setContained(ContainedDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreMedicationAdministration setIdentifier(
         List<IdentifierDt> param);

   public IQICoreMedicationAdministration addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreMedicationAdministration setEncounterResource(
         QICoreEncounterAdapter param);

   public String getStatus();

   public IQICoreMedicationAdministration setStatus(String param);

   public IQICoreMedicationAdministration setStatus(
         MedicationAdministrationStatusEnum param);

   public BoundCodeDt<MedicationAdministrationStatusEnum> getStatusElement();

   public IQICoreMedicationAdministration setStatus(
         BoundCodeDt<MedicationAdministrationStatusEnum> param);

   public QICoreMedicationOrderAdapter getPrescriptionResource();

   public IQICoreMedicationAdministration setPrescriptionResource(
         QICoreMedicationOrderAdapter param);
}