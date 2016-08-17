package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
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
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
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

public interface IReferralRequest
{

   public ReferralRequest getAdaptee();

   public void setAdaptee(ReferralRequest param);

   public IdDt getId();

   public IReferralRequest setId(IdDt param);

   public String getStatus();

   public IReferralRequest setStatus(String param);

   public IReferralRequest setStatus(ReferralStatusEnum param);

   public BoundCodeDt<ReferralStatusEnum> getStatusElement();

   public IReferralRequest setStatus(BoundCodeDt<ReferralStatusEnum> param);

   public Patient getPatientResource();

   public IReferralRequest setPatientResource(Patient param);

   public CodeableConceptDt getSpecialty();

   public IReferralRequest setSpecialty(CodeableConceptDt param);

   public PeriodDt getFulfillmentTime();

   public IReferralRequest setFulfillmentTime(PeriodDt param);

   public CodeDt getLanguage();

   public IReferralRequest setLanguage(CodeDt param);

   public CodeableConceptDt getPriority();

   public IReferralRequest setPriority(CodeableConceptDt param);

   public Encounter getEncounterResource();

   public IReferralRequest setEncounterResource(Encounter param);

   public DateTimeDt getDateElement();

   public Date getDate();

   public IReferralRequest setDate(Date param);

   public IReferralRequest setDate(DateTimeDt param);

   public DateTimeDt getDateSentElement();

   public Date getDateSent();

   public IReferralRequest setDateSent(Date param);

   public IReferralRequest setDateSent(DateTimeDt param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IReferralRequest setDescription(String param);

   public IReferralRequest setDescription(StringDt param);

   public NarrativeDt getText();

   public IReferralRequest setText(NarrativeDt param);

   public CodeableConceptDt getReason();

   public IReferralRequest setReason(CodeableConceptDt param);

   public ContainedDt getContained();

   public IReferralRequest setContained(ContainedDt param);

   public CodeableConceptDt getType();

   public IReferralRequest setType(CodeableConceptDt param);

   public List<IdentifierDt> getIdentifier();

   public IReferralRequest setIdentifier(List<IdentifierDt> param);

   public IReferralRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();
}