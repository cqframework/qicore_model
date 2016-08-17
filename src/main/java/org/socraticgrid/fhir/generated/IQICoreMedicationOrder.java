package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
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
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreMedicationOrder
{

   public MedicationOrder getAdaptee();

   public void setAdaptee(MedicationOrder param);

   public List<QICoreMedicationOrderDosageInstruction> getWrappedDosageInstruction();

   public IQICoreMedicationOrder setWrappedDosageInstruction(
         List<QICoreMedicationOrderDosageInstruction> param);

   public IQICoreMedicationOrder addWrappedDosageInstruction(
         QICoreMedicationOrderDosageInstruction param);

   public QICoreMedicationOrderDosageInstruction addWrappedDosageInstruction();

   public QICoreMedicationOrderDosageInstruction getWrappedDosageInstructionFirstRep();

   public List<MedicationOrder.DosageInstruction> getDosageInstruction();

   public IQICoreMedicationOrder setDosageInstruction(
         List<MedicationOrder.DosageInstruction> param);

   public IQICoreMedicationOrder addDosageInstruction(
         MedicationOrder.DosageInstruction param);

   public MedicationOrder.DosageInstruction addDosageInstruction();

   public MedicationOrder.DosageInstruction getDosageInstructionFirstRep();

   public StringDt getNoteElement();

   public String getNote();

   public IQICoreMedicationOrder setNote(String param);

   public IQICoreMedicationOrder setNote(StringDt param);

   public NarrativeDt getText();

   public IQICoreMedicationOrder setText(NarrativeDt param);

   public MedicationOrder.Substitution getSubstitution();

   public IQICoreMedicationOrder setSubstitution(
         MedicationOrder.Substitution param);

   public DateTimeDt getDateWrittenElement();

   public Date getDateWritten();

   public IQICoreMedicationOrder setDateWritten(Date param);

   public IQICoreMedicationOrder setDateWritten(DateTimeDt param);

   public CodeDt getLanguage();

   public IQICoreMedicationOrder setLanguage(CodeDt param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreMedicationOrder setEncounterResource(
         QICoreEncounterAdapter param);

   public MedicationOrder.DispenseRequest getDispenseRequest();

   public IQICoreMedicationOrder setDispenseRequest(
         MedicationOrder.DispenseRequest param);

   public ContainedDt getContained();

   public IQICoreMedicationOrder setContained(ContainedDt param);

   public String getStatus();

   public IQICoreMedicationOrder setStatus(String param);

   public IQICoreMedicationOrder setStatus(MedicationOrderStatusEnum param);

   public BoundCodeDt<MedicationOrderStatusEnum> getStatusElement();

   public IQICoreMedicationOrder setStatus(
         BoundCodeDt<MedicationOrderStatusEnum> param);

   public QICorePractitionerAdapter getPrescriberResource();

   public IQICoreMedicationOrder setPrescriberResource(
         QICorePractitionerAdapter param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreMedicationOrder setPatientResource(QICorePatientAdapter param);

   public BoundCodeableConceptDt getReasonCodeableConcept();

   public IQICoreMedicationOrder setReasonCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getReasonReference();

   public IQICoreMedicationOrder setReasonReference(ResourceReferenceDt param);

   public DateTimeDt getDateEndedElement();

   public Date getDateEnded();

   public IQICoreMedicationOrder setDateEnded(Date param);

   public IQICoreMedicationOrder setDateEnded(DateTimeDt param);

   public BoundCodeableConceptDt getMedicationCodeableConcept();

   public IQICoreMedicationOrder setMedicationCodeableConcept(
         BoundCodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IQICoreMedicationOrder setMedicationReference(
         ResourceReferenceDt param);

   public IdDt getId();

   public IQICoreMedicationOrder setId(IdDt param);

   public MedicationOrder getPriorPrescriptionResource();

   public IQICoreMedicationOrder setPriorPrescriptionResource(
         MedicationOrder param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreMedicationOrder setIdentifier(List<IdentifierDt> param);

   public IQICoreMedicationOrder addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getReasonEnded();

   public IQICoreMedicationOrder setReasonEnded(CodeableConceptDt param);
}