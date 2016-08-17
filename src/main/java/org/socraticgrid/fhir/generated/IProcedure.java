package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
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
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IProcedure
{

   public Procedure getAdaptee();

   public void setAdaptee(Procedure param);

   public Location getLocationResource();

   public IProcedure setLocationResource(Location param);

   public CodeableConceptDt getOutcome();

   public IProcedure setOutcome(CodeableConceptDt param);

   public List<Procedure.FocalDevice> getFocalDevice();

   public IProcedure setFocalDevice(List<Procedure.FocalDevice> param);

   public IProcedure addFocalDevice(Procedure.FocalDevice param);

   public Procedure.FocalDevice addFocalDevice();

   public Procedure.FocalDevice getFocalDeviceFirstRep();

   public List<IdentifierDt> getIdentifier();

   public IProcedure setIdentifier(List<IdentifierDt> param);

   public IProcedure addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getCategory();

   public IProcedure setCategory(CodeableConceptDt param);

   public DateTimeDt getPerformedDateTimeElement();

   public Date getPerformedDateTime();

   public IProcedure setPerformedDateTime(DateTimeDt param);

   public IProcedure setPerformedDateTime(Date param);

   public PeriodDt getPerformedPeriod();

   public IProcedure setPerformedPeriod(PeriodDt param);

   public List<Procedure.Performer> getPerformer();

   public IProcedure setPerformer(List<Procedure.Performer> param);

   public IProcedure addPerformer(Procedure.Performer param);

   public Procedure.Performer addPerformer();

   public Procedure.Performer getPerformerFirstRep();

   public List<AnnotationDt> getNotes();

   public IProcedure setNotes(List<AnnotationDt> param);

   public IProcedure addNotes(AnnotationDt param);

   public AnnotationDt addNotes();

   public AnnotationDt getNotesFirstRep();

   public NarrativeDt getText();

   public IProcedure setText(NarrativeDt param);

   public BoundCodeableConceptDt getReasonCodeableConcept();

   public IProcedure setReasonCodeableConcept(BoundCodeableConceptDt param);

   public ResourceReferenceDt getReasonReference();

   public IProcedure setReasonReference(ResourceReferenceDt param);

   public IdDt getId();

   public IProcedure setId(IdDt param);

   public BooleanDt getNotPerformedElement();

   public Boolean getNotPerformed();

   public IProcedure setNotPerformed(Boolean param);

   public IProcedure setNotPerformed(BooleanDt param);

   public String getStatus();

   public IProcedure setStatus(String param);

   public IProcedure setStatus(ProcedureStatusEnum param);

   public BoundCodeDt<ProcedureStatusEnum> getStatusElement();

   public IProcedure setStatus(BoundCodeDt<ProcedureStatusEnum> param);

   public CodeableConceptDt getCode();

   public IProcedure setCode(CodeableConceptDt param);

   public Encounter getEncounterResource();

   public IProcedure setEncounterResource(Encounter param);

   public ContainedDt getContained();

   public IProcedure setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IProcedure setLanguage(CodeDt param);
}