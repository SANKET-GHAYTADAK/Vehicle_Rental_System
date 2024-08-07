package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Feedback;


public interface FeedbackService {
    List<Feedback> getAllFeedbacks();

    Feedback getFeedbackById(Long id);

    Feedback createFeedback(Feedback feedback);

    Feedback updateFeedback(Long id, Feedback feedback);

    void deleteFeedback(Long id);
}

