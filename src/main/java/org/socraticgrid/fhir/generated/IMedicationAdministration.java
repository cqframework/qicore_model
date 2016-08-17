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
import ca.uhn.fhir.model.dstu2.resource.Patient;
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
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IMedicationAdministration
{

   public MedicationAdministration getAdaptee();

   public void setAdaptee(MedicationAdministration param);

   public CodeDt getLanguage();

   public IMedicationAdministration setLanguage(CodeDt param);

   public NarrativeDt getText();

   public IMedicationAdministration setText(NarrativeDt param);

   public Patient getPatientResource();

   public IMedicationAdministration setPatientResource(Patient param);

   public MedicationAdministration.Dosage getDosage();

   public IMedicationAdministration setDosage(
         MedicationAdministration.Dosage param);

   public StringDt getNoteElement();

   public String getNote();

   public IMedicationAdministration setNote(String param);

   public IMedicationAdministration setNote(StringDt param);

   public BooleanDt getWasNotGivenElement();

   public Boolean getWasNotGiven();

   public IMedicationAdministration setWasNotGiven(Boolean param);

   public IMedicationAdministration setWasNotGiven(BooleanDt param);

   public DateTimeDt getEffectiveTimeDateTimeElement();

   public Date getEffectiveTimeDateTime();

   public IMedicationAdministration setEffectiveTimeDateTime(DateTimeDt param);

   public IMedicationAdministration setEffectiveTimeDateTime(Date param);

   public PeriodDt getEffectiveTimePeriod();

   public IMedicationAdministration setEffectiveTimePeriod(PeriodDt param);

   public BoundCodeableConceptDt getMedicationCodeableConcept();

   public IMedicationAdministration setMedicationCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IMedicationAdministration setMedicationReference(
         ResourceReferenceDt param);

   public IdDt getId();

   public IMedicationAdministration setId(IdDt param);

   public ContainedDt getContained();

   public IMedicationAdministration setContained(ContainedDt param);

   public List<IdentifierDt> getIdentifier();

   public IMedicationAdministration setIdentifier(List<IdentifierDt> param);

   public IMedicationAdministration addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public Encounter getEncounterResource();

   public IMedicationAdministration setEncounterResource(Encounter param);

   public String getStatus();

   public IMedicationAdministration setStatus(String param);

   public IMedicationAdministration setStatus(
         MedicationAdministrationStatusEnum param);

   public BoundCodeDt<MedicationAdministrationStatusEnum> getStatusElement();

   public IMedicationAdministration setStatus(
         BoundCodeDt<MedicationAdministrationStatusEnum> param);

   public MedicationOrder getPrescriptionResource();

   public IMedicationAdministration setPrescriptionResource(
         MedicationOrder param);
}