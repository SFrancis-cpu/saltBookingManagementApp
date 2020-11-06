//package com.saltsoftware.repository.payment.impl;
//
//import com.saltsoftware.entity.payment.PatientPaymentRecord;
//import com.saltsoftware.repository.payment.PatientPaymentRecordRepository;
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @author name: Linton Appollis
// *student num: 216182484
// *Desc: Repository Class for PatientPaymentRecord
// *date: August 2020
// * */
//
//public class PatientPaymentRecordImpl implements PatientPaymentRecordRepository
//{
//
//    private final Set<PatientPaymentRecord>PatientPaymentRecordImplDB;
//    private static PatientPaymentRecordRepository patientPaymentRecordRepository = null;
//
//    public PatientPaymentRecordImpl(){
//        this.PatientPaymentRecordImplDB = new HashSet<>();
//    }
//
//    public static PatientPaymentRecordRepository getPatientPaymentRecordRepository(){
//        if (patientPaymentRecordRepository == null)
//
//            patientPaymentRecordRepository = new com.saltsoftware.repository.payment.impl.PatientPaymentRecordImpl();
//        return patientPaymentRecordRepository;
//    }
//
//    public PatientPaymentRecord create(PatientPaymentRecord patientPaymentRecord){
//        this.PatientPaymentRecordImplDB.add(patientPaymentRecord);
//        return patientPaymentRecord;
//    }
//
//    public PatientPaymentRecord read(String payReceiptNumber){
//        PatientPaymentRecord patientPaymentRecord = null;
//        for (PatientPaymentRecord er : this.PatientPaymentRecordImplDB){
//            if (er.getPayReceiptNumber().equalsIgnoreCase(payReceiptNumber)) {
//                patientPaymentRecord = er;
//                break;
//            }
//        }
//        return patientPaymentRecord;
//    }
//
//    //this method updates an existing patientPaymentRecord
//    public PatientPaymentRecord update(PatientPaymentRecord patientPaymentRecord){
//
//        //get the object
//
//        PatientPaymentRecord oldpatientPaymentRecord = read(patientPaymentRecord.getPayReceiptNumber());
//        if (oldpatientPaymentRecord != null){
//            this.PatientPaymentRecordImplDB.remove(oldpatientPaymentRecord);
//            this.PatientPaymentRecordImplDB.add(patientPaymentRecord);
//        }
//        //and then update the record
//        return patientPaymentRecord;
//    }
//
//        //this method deletes an internal record : PatientPaymentRecord
//        public boolean delete(String patientPaymentRecord)
//            {
//            PatientPaymentRecord patientPaymentRecord1 = read(patientPaymentRecord);
//
//            if (patientPaymentRecord1 != null);
//                    this.PatientPaymentRecordImplDB.remove(patientPaymentRecord1);
//                return false;
//            }
//
//    @Override
//    public Set<PatientPaymentRecord> getAll() {
//        return this.PatientPaymentRecordImplDB;
//    }
//}
//
