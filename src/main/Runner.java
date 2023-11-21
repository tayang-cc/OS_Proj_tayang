package main;

import main.controller.MainFrameController;

/**
 * @Auther: tayang
 * @Date: 2023/11/19
 * @Description:
 */
public class Runner {

    public static void main(String[] args) {
        MainFrameController mainFrameController = new MainFrameController();

        mainFrameController.showMainFrameWindow();
    }
}
