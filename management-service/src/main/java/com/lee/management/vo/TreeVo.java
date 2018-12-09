package com.lee.management.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lizhe
 */
@Data
public class TreeVo {

    protected List children;

    protected Integer father;

    private Integer id;

    private String name;

    private String describe;


    public static Set<TreeVo> findRoots(Set<TreeVo> allNodes) {
        // 根节点
        Set<TreeVo> root = new HashSet<>();
        allNodes.forEach(node -> {
            if (node.getFather() == 0) {
                root.add(node);
            }
        });
        root.forEach(node -> {
            findChildren(node, allNodes);
        });
        return root;
    }


    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    private static TreeVo findChildren(TreeVo treeNode, Set<TreeVo> treeNodes) {
        for (TreeVo it : treeNodes) {
            if (treeNode.getId().equals(it.getFather())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<TreeVo>());
                }
                treeNode.getChildren().add(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }
}
