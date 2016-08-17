package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.MedicationStatement;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreMedicationStatement
{

   public MedicationStatement getAdaptee();

   public void setAdaptee(MedicationStatement param);

   public BoundCodeableConceptDt getReasonForUseCodeableConcept();

   public IQICoreMedicationStatement setReasonForUseCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getReasonForUseReference();

   public IQICoreMedicationStatement setReasonForUseReference(
         ResourceReferenceDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreMedicationStatement setIdentifier(List<IdentifierDt> param);

   public IQICoreMedicationStatement addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public StringDt getNoteElement();

   public String getNote();

   public IQICoreMedicationStatement setNote(String param);

   public IQICoreMedicationStatement setNote(StringDt param);

   public List<MedicationStatement.Dosage> getDosage();

   public IQICoreMedicationStatement setDosage(
         List<MedicationStatement.Dosage> param);

   public IQICoreMedicationStatement addDosage(MedicationStatement.Dosage param);

   public MedicationStatement.Dosage addDosage();

   public MedicationStatement.Dosage getDosageFirstRep();

   public DateTimeDt getDateAssertedElement();

   public Date getDateAsserted();

   public IQICoreMedicationStatement setDateAsserted(Date param);

   public IQICoreMedicationStatement setDateAsserted(DateTimeDt param);

   public NarrativeDt getText();

   public IQICoreMedicationStatement setText(NarrativeDt param);

   public IdDt getId();

   public IQICoreMedicationStatement setId(IdDt param);

   public CodeDt getLanguage();

   public IQICoreMedicationStatement setLanguage(CodeDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreMedicationStatement setPatientResource(
         QICorePatientAdapter param);

   public String getStatus();

   public IQICoreMedicationStatement setStatus(String param);

   public IQICoreMedicationStatement setStatus(
         MedicationStatementStatusEnum param);

   public BoundCodeDt<MedicationStatementStatusEnum> getStatusElement();

   public IQICoreMedicationStatement setStatus(
         BoundCodeDt<MedicationStatementStatusEnum> param);

   public DateTimeDt getEffectiveDateTimeElement();

   public Date getEffectiveDateTime();

   public IQICoreMedicationStatement setEffectiveDateTime(DateTimeDt param);

   public IQICoreMedicationStatement setEffectiveDateTime(Date param);

   public PeriodDt getEffectivePeriod();

   public IQICoreMedicationStatement setEffectivePeriod(PeriodDt param);

   public ContainedDt getContained();

   public IQICoreMedicationStatement setContained(ContainedDt param);

   public BooleanDt getWasNotTakenElement();

   public Boolean getWasNotTaken();

   public IQICoreMedicationStatement setWasNotTaken(Boolean param);

   public IQICoreMedicationStatement setWasNotTaken(BooleanDt param);

   public BoundCodeableConceptDt getMedicationCodeableConcept();

   public IQICoreMedicationStatement setMedicationCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IQICoreMedicationStatement setMedicationReference(
         ResourceReferenceDt param);
}